package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 天猫品牌特卖搜索结果数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class TmallSearchTmItem extends TaobaoObject {

	private static final long serialVersionUID = 2285257723745684634L;

	/**
	 * 宝贝所属品牌ID
	 */
	@ApiField("brand_id")
	private Long brandId;

	/**
	 * 宝贝所属品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 宝贝评论数
	 */
	@ApiField("comment_num")
	private String commentNum;

	/**
	 * 宝贝佣金比（%）
	 */
	@ApiField("commission_rate")
	private String commissionRate;

	/**
	 * 搜索宝贝url
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 搜索宝贝的图片url
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 搜索宝贝原价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 搜索宝贝特卖价
	 */
	@ApiField("promotion_price")
	private String promotionPrice;

	/**
	 * 宝贝热门标签名称
	 */
	@ApiField("tag_hot")
	private String tagHot;

	/**
	 * 宝贝限量标签名称
	 */
	@ApiField("tag_lq")
	private String tagLq;

	/**
	 * 宝贝新品标签名称
	 */
	@ApiField("tag_new")
	private String tagNew;

	/**
	 * 搜索宝贝的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 商品id（具有跟踪效果）代替原来的num_iid  <a href="http://dev.open.taobao.com/bbs/read.php?tid=24323">详细说明</a>
	 */
	@ApiField("track_iid")
	private String trackIid;

	/**
	 * 搜索宝贝的已售数量 （月销量）
	 */
	@ApiField("volume")
	private Long volume;

	public Long getBrandId() {
		return this.brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCommentNum() {
		return this.commentNum;
	}
	public void setCommentNum(String commentNum) {
		this.commentNum = commentNum;
	}

	public String getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
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

	public String getPromotionPrice() {
		return this.promotionPrice;
	}
	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public String getTagHot() {
		return this.tagHot;
	}
	public void setTagHot(String tagHot) {
		this.tagHot = tagHot;
	}

	public String getTagLq() {
		return this.tagLq;
	}
	public void setTagLq(String tagLq) {
		this.tagLq = tagLq;
	}

	public String getTagNew() {
		return this.tagNew;
	}
	public void setTagNew(String tagNew) {
		this.tagNew = tagNew;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTrackIid() {
		return this.trackIid;
	}
	public void setTrackIid(String trackIid) {
		this.trackIid = trackIid;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

}
