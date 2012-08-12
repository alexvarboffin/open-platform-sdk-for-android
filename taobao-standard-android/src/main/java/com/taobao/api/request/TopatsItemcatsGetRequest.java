package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopatsItemcatsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.topats.itemcats.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class TopatsItemcatsGetRequest implements TaobaoRequest<TopatsItemcatsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 一级类目ID列表（非一级类目将会被忽略），用半角逗号(,)分隔，例如:"16,19562"，一次最多可以获取10个类目的增量数据。<span style="color:red">注：传入0代表获取所有类目的数据。</span>
	 */
	private String cids;

	/** 
	* 类目数据输出格式，可选值为：csv, json。
	 */
	private String outputFormat;

	/** 
	* 卖家类型，可选值：C, B。不传默认值视为C卖家。
	 */
	private String sellerType;

	public void setCids(String cids) {
		this.cids = cids;
	}
	public String getCids() {
		return this.cids;
	}

	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}
	public String getOutputFormat() {
		return this.outputFormat;
	}

	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}
	public String getSellerType() {
		return this.sellerType;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.topats.itemcats.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cids", this.cids);
		txtParams.put("output_format", this.outputFormat);
		txtParams.put("seller_type", this.sellerType);
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

	public Class<TopatsItemcatsGetResponse> getResponseClass() {
		return TopatsItemcatsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(cids,"cids");
		RequestCheckUtils.checkNotEmpty(outputFormat,"outputFormat");
	}
}
