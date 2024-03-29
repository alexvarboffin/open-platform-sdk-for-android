package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureCategoryUpdateResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.picture.category.update request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class PictureCategoryUpdateRequest implements TaobaoRequest<PictureCategoryUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 要更新的图片分类的id
	 */
	private Long categoryId;

	/** 
	* 图片分类的新名字，最大长度20字符，不能为空
	 */
	private String categoryName;

	/** 
	* 图片分类的新父分类id
	 */
	private Long parentId;

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public Long getParentId() {
		return this.parentId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.picture.category.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("category_name", this.categoryName);
		txtParams.put("parent_id", this.parentId);
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

	public Class<PictureCategoryUpdateResponse> getResponseClass() {
		return PictureCategoryUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(categoryId,"categoryId");
		RequestCheckUtils.checkMaxLength(categoryName,20,"categoryName");
	}
}
