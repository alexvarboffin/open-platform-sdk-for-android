package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WidgetCartInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.widget.cartpanel.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WidgetCartpanelGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6297829227537226355L;

	/** 
	 * 当前用户通过当前app加入购物车的商品记录列表。
	 */
	@ApiListField("cart_info")
	@ApiField("widget_cart_info")
	private List<WidgetCartInfo> cartInfo;

	/** 
	 * 当前用户通过当前app加入购物车的商品记录条数。
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setCartInfo(List<WidgetCartInfo> cartInfo) {
		this.cartInfo = cartInfo;
	}
	public List<WidgetCartInfo> getCartInfo( ) {
		return this.cartInfo;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
