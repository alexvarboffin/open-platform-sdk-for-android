package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemrecommendItemsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.itemrecommend.items.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class ItemrecommendItemsGetRequest implements TaobaoRequest<ItemrecommendItemsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 请求返回宝贝的个数，建议取20个
	 */
	private Long count;

	/** 
	* 额外的参数信息
	 */
	private String ext;

	/** 
	* 商品ID
	 */
	private Long itemId;

	/** 
	* 查询类型标识符，可传入1-3，1：同类商品推荐，2：异类商品推荐， 3：同店商品推荐。其他值当非法值处理
	 */
	private Long recommendType;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount() {
		return this.count;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getExt() {
		return this.ext;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public void setRecommendType(Long recommendType) {
		this.recommendType = recommendType;
	}
	public Long getRecommendType() {
		return this.recommendType;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.itemrecommend.items.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("count", this.count);
		txtParams.put("ext", this.ext);
		txtParams.put("item_id", this.itemId);
		txtParams.put("recommend_type", this.recommendType);
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

	public Class<ItemrecommendItemsGetResponse> getResponseClass() {
		return ItemrecommendItemsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(count,"count");
		RequestCheckUtils.checkNotEmpty(itemId,"itemId");
		RequestCheckUtils.checkNotEmpty(recommendType,"recommendType");
	}
}
