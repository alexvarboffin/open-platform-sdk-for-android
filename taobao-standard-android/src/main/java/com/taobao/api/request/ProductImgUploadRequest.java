package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductImgUploadResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.product.img.upload request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class ProductImgUploadRequest implements TaobaoUploadRequest<ProductImgUploadResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 产品图片ID.修改图片时需要传入
	 */
	private Long id;

	/** 
	* 图片内容.图片最大为500K,只支持JPG,GIF格式.
	 */
	private FileItem image;

	/** 
	* 是否将该图片设为主图.可选值:true,false;默认值:false.
	 */
	private Boolean isMajor;

	/** 
	* 图片序号
	 */
	private Long position;

	/** 
	* 产品ID.Product的id
	 */
	private Long productId;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}
	public FileItem getImage() {
		return this.image;
	}

	public void setIsMajor(Boolean isMajor) {
		this.isMajor = isMajor;
	}
	public Boolean getIsMajor() {
		return this.isMajor;
	}

	public void setPosition(Long position) {
		this.position = position;
	}
	public Long getPosition() {
		return this.position;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getProductId() {
		return this.productId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.product.img.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("is_major", this.isMajor);
		txtParams.put("position", this.position);
		txtParams.put("product_id", this.productId);
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
		params.put("image", this.image);
		return params;
	}

	public Class<ProductImgUploadResponse> getResponseClass() {
		return ProductImgUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(image,"image");
		RequestCheckUtils.checkMaxLength(image,1048576,"image");
		RequestCheckUtils.checkNotEmpty(productId,"productId");
	}
}
