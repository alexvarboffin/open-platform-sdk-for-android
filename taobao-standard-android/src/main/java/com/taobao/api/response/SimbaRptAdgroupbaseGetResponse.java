package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.rpt.adgroupbase.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptAdgroupbaseGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5521947232617821972L;

	/** 
	 * 广告组基础数据对象
	 */
	@ApiField("rpt_adgroup_base_list")
	private String rptAdgroupBaseList;

	public void setRptAdgroupBaseList(String rptAdgroupBaseList) {
		this.rptAdgroupBaseList = rptAdgroupBaseList;
	}
	public String getRptAdgroupBaseList( ) {
		return this.rptAdgroupBaseList;
	}

}
