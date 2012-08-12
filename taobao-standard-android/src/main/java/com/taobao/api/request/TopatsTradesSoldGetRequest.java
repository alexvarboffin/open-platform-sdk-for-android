package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopatsTradesSoldGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.topats.trades.sold.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class TopatsTradesSoldGetRequest implements TaobaoRequest<TopatsTradesSoldGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 订单创建结束时间，格式yyyyMMdd，距现在最长间隔是3个月，最近只能取昨天的时间，其中end_time - start_time <= 1个月。如20120531相当于取订单创建时间到2012-05-31 23:59:59为止的订单。注意：如果start_time和end_time相同，表示取一天的订单数据。
	 */
	private String endTime;

	/** 
	* Trade和Order结构体中的所有字段。<span style="color:red">如果只取tid字段，获取订单数据速度会超快。</span>
	 */
	private String fields;

	/** 
	* 订单创建开始时间，格式yyyyMMdd，距现在最长间隔是3个月。如：20120501相当于取订单创建时间从2012-05-01 00:00:00开始的订单。
	 */
	private String startTime;

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime() {
		return this.endTime;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime() {
		return this.startTime;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.topats.trades.sold.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_time", this.endTime);
		txtParams.put("fields", this.fields);
		txtParams.put("start_time", this.startTime);
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

	public Class<TopatsTradesSoldGetResponse> getResponseClass() {
		return TopatsTradesSoldGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(endTime,"endTime");
		RequestCheckUtils.checkNotEmpty(fields,"fields");
		RequestCheckUtils.checkNotEmpty(startTime,"startTime");
	}
}
