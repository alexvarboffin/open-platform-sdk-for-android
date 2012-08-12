package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CaipiaoSignstatusCheckResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.caipiao.signstatus.check request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class CaipiaoSignstatusCheckRequest implements TaobaoRequest<CaipiaoSignstatusCheckResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 用户的淘宝数字ID
	 */
	private Long userNumId;

	public void setUserNumId(Long userNumId) {
		this.userNumId = userNumId;
	}
	public Long getUserNumId() {
		return this.userNumId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.caipiao.signstatus.check";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("user_num_id", this.userNumId);
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

	public Class<CaipiaoSignstatusCheckResponse> getResponseClass() {
		return CaipiaoSignstatusCheckResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(userNumId,"userNumId");
	}
}
