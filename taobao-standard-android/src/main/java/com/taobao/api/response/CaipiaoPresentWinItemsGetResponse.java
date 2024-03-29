package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.LotteryWangcaiPresent;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.caipiao.present.win.items.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CaipiaoPresentWinItemsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6493214788872238252L;

	/** 
	 * 查询的结果集
	 */
	@ApiListField("results")
	@ApiField("lottery_wangcai_present")
	private List<LotteryWangcaiPresent> results;

	/** 
	 * 查询的结果集大小
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setResults(List<LotteryWangcaiPresent> results) {
		this.results = results;
	}
	public List<LotteryWangcaiPresent> getResults( ) {
		return this.results;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
