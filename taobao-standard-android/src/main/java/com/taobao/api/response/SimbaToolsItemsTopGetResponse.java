package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.RankedItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.tools.items.top.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaToolsItemsTopGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6753447521481867149L;

	/** 
	 * 推广组信息列表
	 */
	@ApiListField("rankeditems")
	@ApiField("ranked_item")
	private List<RankedItem> rankeditems;

	public void setRankeditems(List<RankedItem> rankeditems) {
		this.rankeditems = rankeditems;
	}
	public List<RankedItem> getRankeditems( ) {
		return this.rankeditems;
	}

}
