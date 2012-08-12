package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JianghuFanFollowResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.jianghu.fan.follow request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class JianghuFanFollowRequest implements TaobaoRequest<JianghuFanFollowResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 掌柜的id，被关注者的id
	 */
	private Long shopOwnerId;

	public void setShopOwnerId(Long shopOwnerId) {
		this.shopOwnerId = shopOwnerId;
	}
	public Long getShopOwnerId() {
		return this.shopOwnerId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.jianghu.fan.follow";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("shop_owner_id", this.shopOwnerId);
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

	public Class<JianghuFanFollowResponse> getResponseClass() {
		return JianghuFanFollowResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(shopOwnerId,"shopOwnerId");
	}
}
