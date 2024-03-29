package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomImgUploadResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.hotel.room.img.upload request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class HotelRoomImgUploadRequest implements TaobaoUploadRequest<HotelRoomImgUploadResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 酒店房间商品gid。必须为数字。
	 */
	private Long gid;

	/** 
	* 酒店商品图片。类型:JPG,GIF;最大长度:500K。支持的文件类型：gif,jpg,jpeg,png。
如果原图片少于5张，若没传序号或序号大于原图片个数，则在原图片最后添加，否则按序号插入到原图片中去，自动后移。
如果原图片大于5张，若没传序号，则替换最后一张图片，否则在序号位置插入，图片向后移，最后一张被删除。
	 */
	private FileItem pic;

	/** 
	* 图片序号，可选值：1，2，3，4，5
	 */
	private Long position;

	public void setGid(Long gid) {
		this.gid = gid;
	}
	public Long getGid() {
		return this.gid;
	}

	public void setPic(FileItem pic) {
		this.pic = pic;
	}
	public FileItem getPic() {
		return this.pic;
	}

	public void setPosition(Long position) {
		this.position = position;
	}
	public Long getPosition() {
		return this.position;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.room.img.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("gid", this.gid);
		txtParams.put("position", this.position);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("pic", this.pic);
		return params;
	}

	public Class<HotelRoomImgUploadResponse> getResponseClass() {
		return HotelRoomImgUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(gid,"gid");
		RequestCheckUtils.checkNotEmpty(pic,"pic");
		RequestCheckUtils.checkMaxLength(pic,512000,"pic");
	}
}
