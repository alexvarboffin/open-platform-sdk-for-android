package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 渠道信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class ChannelInfo extends TaobaoObject {

	private static final long serialVersionUID = 5817695142579797765L;

	/**
	 * 渠道展示名称
	 */
	@ApiField("channel_display_name")
	private String channelDisplayName;

	/**
	 * 渠道标识代码
	 */
	@ApiField("channel_key")
	private String channelKey;

	/**
	 * 当前渠道所包含的来源referer地址。
	 */
	@ApiListField("referers")
	@ApiField("string")
	private List<String> referers;

	public String getChannelDisplayName() {
		return this.channelDisplayName;
	}
	public void setChannelDisplayName(String channelDisplayName) {
		this.channelDisplayName = channelDisplayName;
	}

	public String getChannelKey() {
		return this.channelKey;
	}
	public void setChannelKey(String channelKey) {
		this.channelKey = channelKey;
	}

	public List<String> getReferers() {
		return this.referers;
	}
	public void setReferers(List<String> referers) {
		this.referers = referers;
	}

}
