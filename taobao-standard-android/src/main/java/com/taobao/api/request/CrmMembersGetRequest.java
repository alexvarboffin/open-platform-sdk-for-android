package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMembersGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.crm.members.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class CrmMembersGetRequest implements TaobaoRequest<CrmMembersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 买家的昵称
	 */
	private String buyerNick;

	/** 
	* 显示第几页的会员，如果输入的页码大于总共的页码数，例如总共10页，但是current_page的值为11，则返回空白页，最小页数为1
	 */
	private Long currentPage;

	/** 
	* 会员等级，0：返回所有会员1：普通客户，2：高级会员，3：VIP会员， 4：至尊VIP会员
(如果要查交易关闭的会员  请选择taobao.crm.members.search接口的 relation_source=2)
	 */
	private Long grade;

	/** 
	* 最迟上次交易时间
	 */
	private Date maxLastTradeTime;

	/** 
	* 最大交易额，单位为元
	 */
	private String maxTradeAmount;

	/** 
	* 最大交易量
	 */
	private Long maxTradeCount;

	/** 
	* 最早上次交易时间
	 */
	private Date minLastTradeTime;

	/** 
	* 最小交易额,单位为元
	 */
	private String minTradeAmount;

	/** 
	* 最小交易量
	 */
	private Long minTradeCount;

	/** 
	* 表示每页显示的会员数量,page_size的最大值不能超过100条,最小值不能低于1，
	 */
	private Long pageSize;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setGrade(Long grade) {
		this.grade = grade;
	}
	public Long getGrade() {
		return this.grade;
	}

	public void setMaxLastTradeTime(Date maxLastTradeTime) {
		this.maxLastTradeTime = maxLastTradeTime;
	}
	public Date getMaxLastTradeTime() {
		return this.maxLastTradeTime;
	}

	public void setMaxTradeAmount(String maxTradeAmount) {
		this.maxTradeAmount = maxTradeAmount;
	}
	public String getMaxTradeAmount() {
		return this.maxTradeAmount;
	}

	public void setMaxTradeCount(Long maxTradeCount) {
		this.maxTradeCount = maxTradeCount;
	}
	public Long getMaxTradeCount() {
		return this.maxTradeCount;
	}

	public void setMinLastTradeTime(Date minLastTradeTime) {
		this.minLastTradeTime = minLastTradeTime;
	}
	public Date getMinLastTradeTime() {
		return this.minLastTradeTime;
	}

	public void setMinTradeAmount(String minTradeAmount) {
		this.minTradeAmount = minTradeAmount;
	}
	public String getMinTradeAmount() {
		return this.minTradeAmount;
	}

	public void setMinTradeCount(Long minTradeCount) {
		this.minTradeCount = minTradeCount;
	}
	public Long getMinTradeCount() {
		return this.minTradeCount;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.members.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("current_page", this.currentPage);
		txtParams.put("grade", this.grade);
		txtParams.put("max_last_trade_time", this.maxLastTradeTime);
		txtParams.put("max_trade_amount", this.maxTradeAmount);
		txtParams.put("max_trade_count", this.maxTradeCount);
		txtParams.put("min_last_trade_time", this.minLastTradeTime);
		txtParams.put("min_trade_amount", this.minTradeAmount);
		txtParams.put("min_trade_count", this.minTradeCount);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<CrmMembersGetResponse> getResponseClass() {
		return CrmMembersGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxLength(buyerNick,32,"buyerNick");
		RequestCheckUtils.checkNotEmpty(currentPage,"currentPage");
		RequestCheckUtils.checkMaxValue(currentPage,1000000L,"currentPage");
		RequestCheckUtils.checkMinValue(currentPage,1L,"currentPage");
		RequestCheckUtils.checkMaxValue(grade,4L,"grade");
		RequestCheckUtils.checkMinValue(grade,1L,"grade");
		RequestCheckUtils.checkMinValue(maxTradeCount,0L,"maxTradeCount");
		RequestCheckUtils.checkMinValue(minTradeCount,0L,"minTradeCount");
		RequestCheckUtils.checkMaxValue(pageSize,100L,"pageSize");
		RequestCheckUtils.checkMinValue(pageSize,1L,"pageSize");
	}
}
