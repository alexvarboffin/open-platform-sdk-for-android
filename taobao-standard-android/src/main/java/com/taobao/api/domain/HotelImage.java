package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 酒店图片
 *
 * @author auto create
 * @since 1.0, null
 */
public class HotelImage extends TaobaoObject {

	private static final long serialVersionUID = 4883267973941731539L;

	/**
	 * 酒店id
	 */
	@ApiField("hid")
	private Long hid;

	/**
	 * 图片地址链接
	 */
	@ApiField("pic")
	private String pic;

	public Long getHid() {
		return this.hid;
	}
	public void setHid(Long hid) {
		this.hid = hid;
	}

	public String getPic() {
		return this.pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}

}
