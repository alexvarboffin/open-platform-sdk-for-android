package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 图片空间的用户信息获取，包括订购容量等
 *
 * @author auto create
 * @since 1.0, null
 */
public class UserInfo extends TaobaoObject {

	private static final long serialVersionUID = 7723767296241969893L;

	/**
	 * 用户的可用容量，即订购量与免费量之和
	 */
	@ApiField("available_space")
	private String availableSpace;

	/**
	 * 图片空间的免费容量
	 */
	@ApiField("free_space")
	private String freeSpace;

	/**
	 * 图片空间的订购有效期
	 */
	@ApiField("order_expiry_date")
	private String orderExpiryDate;

	/**
	 * 用户订购的图片空间容量
	 */
	@ApiField("order_space")
	private String orderSpace;

	/**
	 * 剩余的图片空间容量
	 */
	@ApiField("remaining_space")
	private String remainingSpace;

	/**
	 * 已使用的图片空间容量
	 */
	@ApiField("used_space")
	private String usedSpace;

	/**
	 * 用户自定义的水印参数，通过"|"分割开，如果用户没有定义则为""
具体水印参数组合方法，用"|"分开，顺序按"是否全局设置|水印文字|是否文字水印优先|透明度|字体|字体大小|字体是否加粗|字体是否斜体|字体是否加下划线|字体颜色|旋转角度|是否带阴影|水印位置|图片水印URL|reference水印相对位置" reference取值有左上（1）/中间（3）/右下（2）,其中的null代表为空
	 */
	@ApiField("water_mark")
	private String waterMark;

	public String getAvailableSpace() {
		return this.availableSpace;
	}
	public void setAvailableSpace(String availableSpace) {
		this.availableSpace = availableSpace;
	}

	public String getFreeSpace() {
		return this.freeSpace;
	}
	public void setFreeSpace(String freeSpace) {
		this.freeSpace = freeSpace;
	}

	public String getOrderExpiryDate() {
		return this.orderExpiryDate;
	}
	public void setOrderExpiryDate(String orderExpiryDate) {
		this.orderExpiryDate = orderExpiryDate;
	}

	public String getOrderSpace() {
		return this.orderSpace;
	}
	public void setOrderSpace(String orderSpace) {
		this.orderSpace = orderSpace;
	}

	public String getRemainingSpace() {
		return this.remainingSpace;
	}
	public void setRemainingSpace(String remainingSpace) {
		this.remainingSpace = remainingSpace;
	}

	public String getUsedSpace() {
		return this.usedSpace;
	}
	public void setUsedSpace(String usedSpace) {
		this.usedSpace = usedSpace;
	}

	public String getWaterMark() {
		return this.waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

}
