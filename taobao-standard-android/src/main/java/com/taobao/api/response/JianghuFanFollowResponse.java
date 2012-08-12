package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jianghu.fan.follow response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JianghuFanFollowResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5523121536794788547L;

	/** 
	 * true 成功。false 失败
	 */
	@ApiField("follow_result")
	private Boolean followResult;

	public void setFollowResult(Boolean followResult) {
		this.followResult = followResult;
	}
	public Boolean getFollowResult( ) {
		return this.followResult;
	}

}
