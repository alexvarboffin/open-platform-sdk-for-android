package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 判断是否是粉丝返回的结果集
 *
 * @author auto create
 * @since 1.0, null
 */
public class Check extends TaobaoObject {

	private static final long serialVersionUID = 8714345121692888952L;

	/**
	 * 是否是粉丝
	 */
	@ApiField("check")
	private Boolean check;

	public Boolean getCheck() {
		return this.check;
	}
	public void setCheck(Boolean check) {
		this.check = check;
	}

}
