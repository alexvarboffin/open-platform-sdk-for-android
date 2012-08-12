package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JianghuFanCheckResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.jianghu.fan.check request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class JianghuFanCheckRequest implements TaobaoRequest<JianghuFanCheckResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 粉丝的id
	 */
	private Long followerId;

	/** 
	* 达人的id值
	 */
	private Long userId;

	public void setFollowerId(Long followerId) {
		this.followerId = followerId;
	}
	public Long getFollowerId() {
		return this.followerId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getUserId() {
		return this.userId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.jianghu.fan.check";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("follower_id", this.followerId);
		txtParams.put("user_id", this.userId);
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

	public Class<JianghuFanCheckResponse> getResponseClass() {
		return JianghuFanCheckResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(followerId,"followerId");
		RequestCheckUtils.checkNotEmpty(userId,"userId");
	}
}
