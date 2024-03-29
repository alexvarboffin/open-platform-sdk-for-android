package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 关键词排名推广商品信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class RankedItem extends TaobaoObject {

	private static final long serialVersionUID = 5584538468761956827L;

	/**
	 * 商品链接
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 最高出价
	 */
	@ApiField("max_price")
	private String maxPrice;

	/**
	 * 客户昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 排名
	 */
	@ApiField("order")
	private Long order;

	/**
	 * 原始质量评分
	 */
	@ApiField("rank_score")
	private Long rankScore;

	/**
	 * 创意标题
	 */
	@ApiField("title")
	private String title;

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getMaxPrice() {
		return this.maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getOrder() {
		return this.order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}

	public Long getRankScore() {
		return this.rankScore;
	}
	public void setRankScore(Long rankScore) {
		this.rankScore = rankScore;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
