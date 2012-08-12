package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGradeGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.crm.grade.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class CrmGradeGetRequest implements TaobaoRequest<CrmGradeGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.grade.get";
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

	public Class<CrmGradeGetResponse> getResponseClass() {
		return CrmGradeGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
	}
}
