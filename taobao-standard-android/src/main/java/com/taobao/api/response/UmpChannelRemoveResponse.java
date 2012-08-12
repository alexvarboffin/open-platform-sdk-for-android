package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ump.channel.remove response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpChannelRemoveResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4355537422243812469L;

	/** 
	 * 本次操作所影响到的referer个数。
	 */
	@ApiField("effect_referer_number")
	private Long effectRefererNumber;

	public void setEffectRefererNumber(Long effectRefererNumber) {
		this.effectRefererNumber = effectRefererNumber;
	}
	public Long getEffectRefererNumber( ) {
		return this.effectRefererNumber;
	}

}
