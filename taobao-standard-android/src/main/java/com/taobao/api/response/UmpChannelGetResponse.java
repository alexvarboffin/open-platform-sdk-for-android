package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ChannelInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ump.channel.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpChannelGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5482438142473375973L;

	/** 
	 * 渠道信息。
	 */
	@ApiListField("channels")
	@ApiField("channel_info")
	private List<ChannelInfo> channels;

	public void setChannels(List<ChannelInfo> channels) {
		this.channels = channels;
	}
	public List<ChannelInfo> getChannels( ) {
		return this.channels;
	}

}
