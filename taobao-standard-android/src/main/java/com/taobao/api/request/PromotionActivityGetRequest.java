package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionActivityGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.promotion.activity.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class PromotionActivityGetRequest implements TaobaoRequest<PromotionActivityGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 活动的id
	 */
	private Long activityId;

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}
	public Long getActivityId() {
		return this.activityId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.activity.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("activity_id", this.activityId);
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

	public Class<PromotionActivityGetResponse> getResponseClass() {
		return PromotionActivityGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
	}
}
