package com.taobao.api.internal.mapping;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.util.StringUtils;

/**
 * 转换工具类。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Converters {

	public static boolean isCheckJsonType = false; // 是否对JSON返回的数据类型进行校验，默认不校验。给内部测试JSON返回时用的开关。规则：返回的"基本"类型只有String,Long,Boolean,Date,采取严格校验方式，如果类型不匹配，报错

	private static final Set<String> baseFields = new HashSet<String>();

	static {
		baseFields.add("errorCode");
		baseFields.add("msg");
		baseFields.add("subCode");
		baseFields.add("subMsg");
		baseFields.add("body");
		baseFields.add("params");
		baseFields.add("success");
		baseFields.add("topForbiddenFields");
	}

	private Converters() {
	}

	/**
	 * 使用指定 的读取器去转换字符串为对象。
	 * 
	 * @param <T>
	 *            领域泛型
	 * @param clazz
	 *            领域类型
	 * @param reader
	 *            读取器
	 * @return 领域对象
	 * @throws ApiException
	 */
	public static <T> T convert(Class<T> clazz, Reader reader)
			throws ApiException {
		T rsp = null;

		try {
			rsp = clazz.newInstance();
			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				if (!method.getName().startsWith("set")) {
					continue;
				}
				String name = method.getName().substring(3);
				String itemName = name.substring(0, 1).toLowerCase(
						Locale.ENGLISH)
						+ name.substring(1);
				String listName = null;

				Field field;
				if (baseFields.contains(itemName)
						&& TaobaoResponse.class.isAssignableFrom(clazz)) {
					field = TaobaoResponse.class.getDeclaredField(itemName);
				} else {
					field = clazz.getDeclaredField(itemName);
				}

				ApiField jsonField = field.getAnnotation(ApiField.class);
				if (jsonField != null) {
					itemName = jsonField.value();
				}
				ApiListField jsonListField = field
						.getAnnotation(ApiListField.class);
				if (jsonListField != null) {
					listName = jsonListField.value();
				}

				if (!reader.hasReturnField(itemName)) {
					if (listName == null || !reader.hasReturnField(listName)) {
						continue; // ignore non-return field
					}
				}

				Class<?> typeClass = field.getType();
				// 目前
				if (String.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(itemName);
					if (value instanceof String) {
						method.invoke(rsp, value.toString());
					} else {
						if (isCheckJsonType && value != null) {
							throw new ApiException(itemName
									+ " is not a String");
						}
						if (value != null) {
							method.invoke(rsp, value.toString());
						} else {
							method.invoke(rsp, "");
						}
					}
				} else if (Long.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(itemName);
					if (value instanceof Long) {
						method.invoke(rsp, (Long) value);
					} else {
						if (isCheckJsonType && value != null) {
							throw new ApiException(itemName
									+ " is not a Number(Long)");
						}
						if (StringUtils.isNumeric(value)) {
							method.invoke(rsp, Long.valueOf(value.toString()));
						}
					}
				} else if (Integer.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(itemName);
					if (value instanceof Integer) {
						method.invoke(rsp, (Integer) value);
					} else {
						if (isCheckJsonType && value != null) {
							throw new ApiException(itemName
									+ " is not a Number(Integer)");
						}
						if (StringUtils.isNumeric(value)) {
							method.invoke(rsp,
									Integer.valueOf(value.toString()));
						}
					}
				} else if (Boolean.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(itemName);
					if (value instanceof Boolean) {
						method.invoke(rsp, (Boolean) value);
					} else {
						if (isCheckJsonType && value != null) {
							throw new ApiException(itemName
									+ " is not a Boolean");
						}
						if (value != null) {
							method.invoke(rsp,
									Boolean.valueOf(value.toString()));
						}
					}
				} else if (Double.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(itemName);
					if (value instanceof Double) {
						method.invoke(rsp, (Double) value);
					} else {
						if (isCheckJsonType && value != null) {
							throw new ApiException(itemName
									+ " is not a Double");
						}
					}
				} else if (Number.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(itemName);
					if (value instanceof Number) {
						method.invoke(rsp, (Number) value);
					} else {
						if (isCheckJsonType && value != null) {
							throw new ApiException(itemName
									+ " is not a Number");
						}
					}
				} else if (Date.class.isAssignableFrom(typeClass)) {
					DateFormat format = new SimpleDateFormat(
							Constants.DATE_TIME_FORMAT);
					format.setTimeZone(TimeZone
							.getTimeZone(Constants.DATE_TIMEZONE));
					Object value = reader.getPrimitiveObject(itemName);
					if (value instanceof String) {
						method.invoke(rsp, format.parse(value.toString()));
					}
				} else if (List.class.isAssignableFrom(typeClass)) {
					Type fieldType = field.getGenericType();
					if (fieldType instanceof ParameterizedType) {
						ParameterizedType paramType = (ParameterizedType) fieldType;
						Type[] genericTypes = paramType
								.getActualTypeArguments();
						if (genericTypes != null && genericTypes.length > 0) {
							if (genericTypes[0] instanceof Class<?>) {
								Class<?> subType = (Class<?>) genericTypes[0];
								List<?> listObjs = reader.getListObjects(
										listName, itemName, subType);
								if (listObjs != null) {
									method.invoke(rsp, listObjs);
								}
							}
						}
					}
				} else {
					Object obj = reader.getObject(itemName, typeClass);
					if (obj != null) {
						method.invoke(rsp, obj);
					}
				}
			}
		} catch (Exception e) {
			throw new ApiException(e);
		}

		return rsp;
	}
}
