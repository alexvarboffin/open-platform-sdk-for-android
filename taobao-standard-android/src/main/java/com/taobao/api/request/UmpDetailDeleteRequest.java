package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpDetailDeleteResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.ump.detail.delete request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class UmpDetailDeleteRequest implements TaobaoRequest<UmpDetailDeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 活动详情id
	 */
	private Long detailId;

	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}
	public Long getDetailId() {
		return this.detailId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ump.detail.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("detail_id", this.detailId);
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

	public Class<UmpDetailDeleteResponse> getResponseClass() {
		return UmpDetailDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(detailId,"detailId");
	}
}
