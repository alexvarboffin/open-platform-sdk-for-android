package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureUploadResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.picture.upload request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class PictureUploadRequest implements TaobaoUploadRequest<PictureUploadResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 包括后缀名的图片标题,不能为空，如Bule.jpg,有些卖家希望图片上传后取图片文件的默认名
	 */
	private String imageInputTitle;

	/** 
	* 图片二进制文件流,不能为空,允许png、jpg、gif图片格式
	 */
	private FileItem img;

	/** 
	* 图片分类ID，设置具体某个分类ID或设置0上传到默认分类，只能传入一个分类
	 */
	private Long pictureCategoryId;

	/** 
	* 图片标题,如果为空,传的图片标题就取去掉后缀名的image_input_title,超过50字符长度会截取50字符,重名会在标题末尾加"(1)";标题末尾已经有"(数字)"了，则数字加1
	 */
	private String title;

	public void setImageInputTitle(String imageInputTitle) {
		this.imageInputTitle = imageInputTitle;
	}
	public String getImageInputTitle() {
		return this.imageInputTitle;
	}

	public void setImg(FileItem img) {
		this.img = img;
	}
	public FileItem getImg() {
		return this.img;
	}

	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}
	public Long getPictureCategoryId() {
		return this.pictureCategoryId;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.picture.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("image_input_title", this.imageInputTitle);
		txtParams.put("picture_category_id", this.pictureCategoryId);
		txtParams.put("title", this.title);
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
		params.put("img", this.img);
		return params;
	}

	public Class<PictureUploadResponse> getResponseClass() {
		return PictureUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(imageInputTitle,"imageInputTitle");
		RequestCheckUtils.checkNotEmpty(img,"img");
		RequestCheckUtils.checkNotEmpty(pictureCategoryId,"pictureCategoryId");
	}
}
