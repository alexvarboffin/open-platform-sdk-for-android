package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.rpt.adgroupcreativebase.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptAdgroupcreativebaseGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7857724869493182173L;

	/** 
	 * 推广组下的创意基础数据列表
	 */
	@ApiField("rpt_adgroupcreative_base_list")
	private String rptAdgroupcreativeBaseList;

	public void setRptAdgroupcreativeBaseList(String rptAdgroupcreativeBaseList) {
		this.rptAdgroupcreativeBaseList = rptAdgroupcreativeBaseList;
	}
	public String getRptAdgroupcreativeBaseList( ) {
		return this.rptAdgroupcreativeBaseList;
	}

}
