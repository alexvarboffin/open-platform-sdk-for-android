package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaCampaignAreaoptionsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.simba.campaign.areaoptions.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class SimbaCampaignAreaoptionsGetRequest implements TaobaoRequest<SimbaCampaignAreaoptionsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.simba.campaign.areaoptions.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
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

	public Class<SimbaCampaignAreaoptionsGetResponse> getResponseClass() {
		return SimbaCampaignAreaoptionsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
	}
}
