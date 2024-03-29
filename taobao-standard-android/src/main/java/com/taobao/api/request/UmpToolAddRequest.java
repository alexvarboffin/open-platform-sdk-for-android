package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpToolAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.ump.tool.add request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class UmpToolAddRequest implements TaobaoRequest<UmpToolAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 工具内容，由sdk里面的MarketingTool生成的json字符串
	 */
	private String content;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ump.tool.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
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

	public Class<UmpToolAddResponse> getResponseClass() {
		return UmpToolAddResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(content,"content");
	}
}
