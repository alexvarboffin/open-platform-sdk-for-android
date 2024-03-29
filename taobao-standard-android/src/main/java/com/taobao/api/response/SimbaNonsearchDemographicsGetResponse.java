package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.DemographicSetting;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.nonsearch.demographics.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaNonsearchDemographicsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7773147296289854926L;

	/** 
	 * 人群维度设置列表
	 */
	@ApiListField("demographic_setting_list")
	@ApiField("demographic_setting")
	private List<DemographicSetting> demographicSettingList;

	public void setDemographicSettingList(List<DemographicSetting> demographicSettingList) {
		this.demographicSettingList = demographicSettingList;
	}
	public List<DemographicSetting> getDemographicSettingList( ) {
		return this.demographicSettingList;
	}

}
