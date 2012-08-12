package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 组件购物车记录
 *
 * @author auto create
 * @since 1.0, null
 */
public class WidgetCartInfo extends TaobaoObject {

	private static final long serialVersionUID = 7717861826156289222L;

	/**
	 * 购物车记录的id，同BaseCartInfo中的cart_id
	 */
	@ApiField("cart_id")
	private Long cartId;

	/**
	 * 此条购物车记录的删除链接。服务端签名后的删除链接，isv在使用的时候前面加上“http://gw.api.taobao.com/widget?”即可生成完整的购物车记录删除链接。
	 */
	@ApiField("delete_url")
	private String deleteUrl;

	/**
	 * 购买的商品的商品数字id，同BaseCartInfo中的item_id,和Item中的num_iid
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 商品详情页连接地址，同Item的detail_url字段
	 */
	@ApiField("item_url")
	private String itemUrl;

	/**
	 * 购买的商品的图片地址，如果选择了sku并且sku有单独的图片，此地址为sku的图片地址
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 购买商品的价格，如果无sku，此价格为商品的当前价格。如果有sku，此价格为购买的sku的当前价格。如果此sku已经不存在，显示商品的价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 购买数量，同BaseCartInfo的quantity
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品的卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * sku的属性列表。如果购买的商品无sku，此字段为空。如果有sku，次字段返回sku的属性描述（属性名:属性值别名/属性值名，别名优先）。
	 */
	@ApiField("sku")
	private String sku;

	/**
	 * 购买的商品的title，同Item的title
	 */
	@ApiField("title")
	private String title;

	public Long getCartId() {
		return this.cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public String getDeleteUrl() {
		return this.deleteUrl;
	}
	public void setDeleteUrl(String deleteUrl) {
		this.deleteUrl = deleteUrl;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemUrl() {
		return this.itemUrl;
	}
	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getSku() {
		return this.sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
