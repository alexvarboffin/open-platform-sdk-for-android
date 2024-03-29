package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductcatsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.fenxiao.productcats.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class FenxiaoProductcatsGetRequest implements TaobaoRequest<FenxiaoProductcatsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 返回字段列表
	 */
	private String fields;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.productcats.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
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

	public Class<FenxiaoProductcatsGetResponse> getResponseClass() {
		return FenxiaoProductcatsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
	}
}
