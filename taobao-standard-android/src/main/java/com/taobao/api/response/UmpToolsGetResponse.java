package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ump.tools.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpToolsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2117463659616962116L;

	/** 
	 * 工具列表，单个内容为json格式，需要通过ump的sdk提供的MarketingBuilder来进行处理
	 */
	@ApiListField("tools")
	@ApiField("string")
	private List<String> tools;

	public void setTools(List<String> tools) {
		this.tools = tools;
	}
	public List<String> getTools( ) {
		return this.tools;
	}

}
