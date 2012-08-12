package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaAdgroupOnlineitemsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.simba.adgroup.onlineitems.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class SimbaAdgroupOnlineitemsGetRequest implements TaobaoRequest<SimbaAdgroupOnlineitemsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 主人昵称
	 */
	private String nick;

	/** 
	* 排序，true:降序， false:升序
	 */
	private Boolean orderBy;

	/** 
	* 排序字段，starts：按开始时间排序bidCount:按销量排序
	 */
	private String orderField;

	/** 
	* 页码，从1开始
	 */
	private Long pageNo;

	/** 
	* 页尺寸，最大200
	 */
	private Long pageSize;

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setOrderBy(Boolean orderBy) {
		this.orderBy = orderBy;
	}
	public Boolean getOrderBy() {
		return this.orderBy;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}
	public String getOrderField() {
		return this.orderField;
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

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.simba.adgroup.onlineitems.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		txtParams.put("order_by", this.orderBy);
		txtParams.put("order_field", this.orderField);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
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

	public Class<SimbaAdgroupOnlineitemsGetResponse> getResponseClass() {
		return SimbaAdgroupOnlineitemsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
	}
}
