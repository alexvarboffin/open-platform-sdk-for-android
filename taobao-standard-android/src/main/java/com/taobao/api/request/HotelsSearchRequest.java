package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelsSearchResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.hotels.search request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class HotelsSearchRequest implements TaobaoRequest<HotelsSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 城市编码。参见：http://kezhan.trip.taobao.com/area.html。
domestic为true时，province,city,district不能同时为空或为0
	 */
	private Long city;

	/** 
	* domestic为true时，固定China；
domestic为false时，必须传定义的海外国家编码值，是必填项。参见：http://kezhan.trip.taobao.com/countrys.html
	 */
	private String country;

	/** 
	* 区域（县级市）编码。参见：http://kezhan.trip.taobao.com/area.html。
domestic为true时，province,city,district不能同时为空或为0
	 */
	private Long district;

	/** 
	* 是否国内酒店。可选值：true，false
	 */
	private Boolean domestic;

	/** 
	* 酒店名称。不能超过60字节
	 */
	private String name;

	/** 
	* 分页页码。取值范围，大于零的整数，默认值1，即返回第一页的数据。页面大小为20
	 */
	private Long pageNo;

	/** 
	* 省份编码。参见：http://kezhan.trip.taobao.com/area.html。
domestic为true时，province,city,district不能同时为空或为0
	 */
	private Long province;

	public void setCity(Long city) {
		this.city = city;
	}
	public Long getCity() {
		return this.city;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry() {
		return this.country;
	}

	public void setDistrict(Long district) {
		this.district = district;
	}
	public Long getDistrict() {
		return this.district;
	}

	public void setDomestic(Boolean domestic) {
		this.domestic = domestic;
	}
	public Boolean getDomestic() {
		return this.domestic;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setProvince(Long province) {
		this.province = province;
	}
	public Long getProvince() {
		return this.province;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotels.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("city", this.city);
		txtParams.put("country", this.country);
		txtParams.put("district", this.district);
		txtParams.put("domestic", this.domestic);
		txtParams.put("name", this.name);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("province", this.province);
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

	public Class<HotelsSearchResponse> getResponseClass() {
		return HotelsSearchResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(domestic,"domestic");
		RequestCheckUtils.checkMaxLength(name,60,"name");
	}
}
