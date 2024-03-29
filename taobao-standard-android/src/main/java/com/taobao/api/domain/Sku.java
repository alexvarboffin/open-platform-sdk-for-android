package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Sku结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Sku extends TaobaoObject {

	private static final long serialVersionUID = 2274814635774336845L;

	/**
	 * sku创建日期 时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private String created;

	/**
	 * sku所属商品id(注意：iid近期即将废弃，请用num_iid参数)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * sku最后修改日期 时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private String modified;

	/**
	 * sku所属商品数字id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 商家设置的外部id
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 属于这个sku的商品的价格 取值范围:0-100000000;精确到2位小数;单位:元。如:200.07，表示:200元7分。
	 */
	@ApiField("price")
	private String price;

	/**
	 * sku的销售属性组合字符串（颜色，大小，等等，可通过类目API获取某类目下的销售属性）,格式是p1:v1;p2:v2
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * sku所对应的销售属性的中文名字串，格式如：pid1:vid1:pid_name1:vid_name1;pid2:vid2:pid_name2:vid_name2……
	 */
	@ApiField("properties_name")
	private String propertiesName;

	/**
	 * 属于这个sku的商品的数量，
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * sku的id
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * sku状态。 normal:正常 ；delete:删除
	 */
	@ApiField("status")
	private String status;

	public String getCreated() {
		return this.created;
	}
	public void setCreated(String created) {
		this.created = created;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getModified() {
		return this.modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getPropertiesName() {
		return this.propertiesName;
	}
	public void setPropertiesName(String propertiesName) {
		this.propertiesName = propertiesName;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
