package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 推广计划的日限额
 *
 * @author auto create
 * @since 1.0, null
 */
public class CampaignBudget extends TaobaoObject {

	private static final long serialVersionUID = 3753881943863134149L;

	/**
	 * 日限额，单位是元，不得小于30
	 */
	@ApiField("budget")
	private Long budget;

	/**
	 * 推广计划ID
	 */
	@ApiField("campaign_id")
	private Long campaignId;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 是否平滑消耗，true-是；false-否；在设置了推广计划日限额后，此属性才生效
	 */
	@ApiField("is_smooth")
	private Boolean isSmooth;

	/**
	 * 最后修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 主人昵称
	 */
	@ApiField("nick")
	private String nick;

	public Long getBudget() {
		return this.budget;
	}
	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public Long getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Boolean getIsSmooth() {
		return this.isSmooth;
	}
	public void setIsSmooth(Boolean isSmooth) {
		this.isSmooth = isSmooth;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

}
