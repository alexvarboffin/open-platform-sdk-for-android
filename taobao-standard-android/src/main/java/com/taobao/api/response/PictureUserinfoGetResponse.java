package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.UserInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.userinfo.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PictureUserinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8115728628253789548L;

	/** 
	 * 用户使用图片空间的信息
	 */
	@ApiField("user_info")
	private UserInfo userInfo;

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public UserInfo getUserInfo( ) {
		return this.userInfo;
	}

}
