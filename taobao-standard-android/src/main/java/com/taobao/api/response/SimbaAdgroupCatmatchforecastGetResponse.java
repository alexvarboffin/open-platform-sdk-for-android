package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ADGroupCatMatchForecast;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.adgroup.catmatchforecast.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupCatmatchforecastGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2815694236197157822L;

	/** 
	 * 类目出价预估结果信息 预测数据皆为估算结果，以实际发生为准
	 */
	@ApiField("adgroup_catmatch_forecast")
	private ADGroupCatMatchForecast adgroupCatmatchForecast;

	public void setAdgroupCatmatchForecast(ADGroupCatMatchForecast adgroupCatmatchForecast) {
		this.adgroupCatmatchForecast = adgroupCatmatchForecast;
	}
	public ADGroupCatMatchForecast getAdgroupCatmatchForecast( ) {
		return this.adgroupCatmatchForecast;
	}

}
