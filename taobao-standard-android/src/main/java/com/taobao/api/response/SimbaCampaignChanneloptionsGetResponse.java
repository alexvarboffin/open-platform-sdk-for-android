package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ChannelOption;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.campaign.channeloptions.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCampaignChanneloptionsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8182925856757927657L;

	/** 
	 * 所有推广计划可投放的频道
	 */
	@ApiListField("channel_options")
	@ApiField("channel_option")
	private List<ChannelOption> channelOptions;

	public void setChannelOptions(List<ChannelOption> channelOptions) {
		this.channelOptions = channelOptions;
	}
	public List<ChannelOption> getChannelOptions( ) {
		return this.channelOptions;
	}

}
