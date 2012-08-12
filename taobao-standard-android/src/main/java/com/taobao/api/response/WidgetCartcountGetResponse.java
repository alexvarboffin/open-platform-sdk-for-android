package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.widget.cartcount.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WidgetCartcountGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8271596937651725559L;

	/** 
	 * 当前用户通过当前app加入购物车的商品记录条数。
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
