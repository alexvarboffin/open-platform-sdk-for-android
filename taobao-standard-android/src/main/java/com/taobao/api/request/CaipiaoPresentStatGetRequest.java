package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CaipiaoPresentStatGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.caipiao.present.stat.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class CaipiaoPresentStatGetRequest implements TaobaoRequest<CaipiaoPresentStatGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 指定查询的天数，从当前日期（不包括当前日期）向前推算的天数，可为空。如果为空、0、负数或者大于90天，则设置为默认的90天。举例：当天是20120703， days=2， 则统计数据的日期为：20120702，20120701.
	 */
	private Long days;

	/** 
	* 送彩方的淘宝数字ID，不可为空、0和负数。
	 */
	private Long userNumId;

	public void setDays(Long days) {
		this.days = days;
	}
	public Long getDays() {
		return this.days;
	}

	public void setUserNumId(Long userNumId) {
		this.userNumId = userNumId;
	}
	public Long getUserNumId() {
		return this.userNumId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.caipiao.present.stat.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("days", this.days);
		txtParams.put("user_num_id", this.userNumId);
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

	public Class<CaipiaoPresentStatGetResponse> getResponseClass() {
		return CaipiaoPresentStatGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(userNumId,"userNumId");
	}
}
