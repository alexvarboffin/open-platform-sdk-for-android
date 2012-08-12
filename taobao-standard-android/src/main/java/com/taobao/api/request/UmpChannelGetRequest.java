package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpChannelGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.ump.channel.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class UmpChannelGetRequest implements TaobaoRequest<UmpChannelGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 渠道代码以逗号(半角)隔开，若channel_keys为空，则返回所有已维护的渠道信息。
	 */
	private String channelKeys;

	public void setChannelKeys(String channelKeys) {
		this.channelKeys = channelKeys;
	}
	public String getChannelKeys() {
		return this.channelKeys;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ump.channel.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel_keys", this.channelKeys);
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

	public Class<UmpChannelGetResponse> getResponseClass() {
		return UmpChannelGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
	}
}
