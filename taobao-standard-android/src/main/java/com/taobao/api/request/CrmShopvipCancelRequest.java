package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmShopvipCancelResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.crm.shopvip.cancel request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class CrmShopvipCancelRequest implements TaobaoRequest<CrmShopvipCancelResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.shopvip.cancel";
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

	public Class<CrmShopvipCancelResponse> getResponseClass() {
		return CrmShopvipCancelResponse.class;
	}

	public void check() throws ApiRuleException {
		
	}
}
