package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 类目属性对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class INCategoryProperties extends TaobaoObject {

	private static final long serialVersionUID = 6267234666118867844L;

	/**
	 * 类目属性对象描述
	 */
	@ApiField("properties_desc")
	private String propertiesDesc;

	/**
	 * 类目属性对象ID
	 */
	@ApiField("properties_id")
	private Long propertiesId;

	/**
	 * 类目属性名称
	 */
	@ApiField("properties_name")
	private String propertiesName;

	public String getPropertiesDesc() {
		return this.propertiesDesc;
	}
	public void setPropertiesDesc(String propertiesDesc) {
		this.propertiesDesc = propertiesDesc;
	}

	public Long getPropertiesId() {
		return this.propertiesId;
	}
	public void setPropertiesId(Long propertiesId) {
		this.propertiesId = propertiesId;
	}

	public String getPropertiesName() {
		return this.propertiesName;
	}
	public void setPropertiesName(String propertiesName) {
		this.propertiesName = propertiesName;
	}

}
