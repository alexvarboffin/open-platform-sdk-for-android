package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 分销商品下载记录
 *
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoItemRecord extends TaobaoObject {

	private static final long serialVersionUID = 2333858214446697948L;

	/**
	 * 下载时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 分销商ID
	 */
	@ApiField("distributor_id")
	private Long distributorId;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 更新时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 产品ID
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 分销方式：AGENT（只做代销，默认值）、DEALER（只做经销）
	 */
	@ApiField("trade_type")
	private String tradeType;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getDistributorId() {
		return this.distributorId;
	}
	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
