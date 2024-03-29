package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelSoldTypesIncrementGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.hotel.sold.types.increment.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class HotelSoldTypesIncrementGetRequest implements TaobaoRequest<HotelSoldTypesIncrementGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 查询修改结束时间，必须大于修改开始时间（修改时间跨度不能大于1天）。格式：yyyy-MM-dd HH:mm:ss
	 */
	private Date endModified;

	/** 
	* 分页页码。取值范围，大于零的整数，默认值1，即返回第一页的数据。
	 */
	private Long pageNo;

	/** 
	* 页面大小，取值范围1-100，默认大小20。
	 */
	private Long pageSize;

	/** 
	* 查询修改开始时间（修改时间跨度不能大于1天）。格式：yyyy-MM-dd HH:mm:ss
	 */
	private Date startModified;

	/** 
	* 是否使用has_next的分页方式，如果指定true，则返回的结果中不包含总记录数，但是会新增一个是否存在下一页的字段，效率比总记录数高
	 */
	private Boolean useHasNext;

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}
	public Date getEndModified() {
		return this.endModified;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}
	public Date getStartModified() {
		return this.startModified;
	}

	public void setUseHasNext(Boolean useHasNext) {
		this.useHasNext = useHasNext;
	}
	public Boolean getUseHasNext() {
		return this.useHasNext;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.sold.types.increment.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_modified", this.endModified);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_modified", this.startModified);
		txtParams.put("use_has_next", this.useHasNext);
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

	public Class<HotelSoldTypesIncrementGetResponse> getResponseClass() {
		return HotelSoldTypesIncrementGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(endModified,"endModified");
		RequestCheckUtils.checkNotEmpty(startModified,"startModified");
	}
}
