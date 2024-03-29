package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.inventory.sync response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbInventorySyncResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1728324597998488139L;

	/** 
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

}
