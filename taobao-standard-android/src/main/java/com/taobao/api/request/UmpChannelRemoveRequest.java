package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpChannelRemoveResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.ump.channel.remove request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class UmpChannelRemoveRequest implements TaobaoRequest<UmpChannelRemoveResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 标示某个渠道的代码（由新增渠道时添加）。
	 */
	private String channelKey;

	/** 
	* 当前渠道中，需要删除的referer地址。
referers为空，删除当前渠道信息，同时清空当前渠道已关联的所有referer。
	 */
	private String referers;

	public void setChannelKey(String channelKey) {
		this.channelKey = channelKey;
	}
	public String getChannelKey() {
		return this.channelKey;
	}

	public void setReferers(String referers) {
		this.referers = referers;
	}
	public String getReferers() {
		return this.referers;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ump.channel.remove";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel_key", this.channelKey);
		txtParams.put("referers", this.referers);
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

	public Class<UmpChannelRemoveResponse> getResponseClass() {
		return UmpChannelRemoveResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(channelKey,"channelKey");
	}
}
