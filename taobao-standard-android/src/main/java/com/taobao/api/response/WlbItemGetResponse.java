package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbItemGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2255776861252829167L;

	/** 
	 * 商品信息
	 */
	@ApiField("item")
	private WlbItem item;

	public void setItem(WlbItem item) {
		this.item = item;
	}
	public WlbItem getItem( ) {
		return this.item;
	}

}
