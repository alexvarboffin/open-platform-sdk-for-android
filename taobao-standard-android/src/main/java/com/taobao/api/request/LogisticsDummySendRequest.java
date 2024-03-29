package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsDummySendResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.logistics.dummy.send request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class LogisticsDummySendRequest implements TaobaoRequest<LogisticsDummySendResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* feature参数格式<br>
范例: mobileCode=tid1:手机串号1,手机串号2|tid2:手机串号3;machineCode=tid3:3C机器号A,3C机器号B<br>
mobileCode无忧购的KEY,machineCode为3C的KEY,多个key之间用”;”分隔<br>
“tid1:手机串号1,手机串号2|tid2:手机串号3”为mobileCode对应的value。
"|"不同商品间的分隔符。<br>
例A商品和B商品都属于无忧购商品，之间就用"|"分开。<br>
TID就是商品代表的子订单号，对应taobao.trade.fullinfo.get 接口获得的oid字段。(通过OID可以唯一定位到当前商品上)<br>
":"TID和具体传入参数间的分隔符。冒号前表示TID,之后代表该商品的参数属性。<br>
"," 属性间分隔符。（对应商品数量，当存在一个商品的数量超过1个时，用逗号分开）。<br>
具体:当订单中A商品的数量为2个，其中手机串号分别为"12345","67890"。<br>
参数格式：mobileCode=TIDA:12345,67890。
TIDA对应了A宝贝，冒号后用逗号分隔的"12345","67890".说明本订单A宝贝的数量为2，值分别为"12345","67890"。<br>
当存在"|"时，就说明订单中存在多个无忧购的商品，商品间用"|"分隔了开来。|"之后的内容含义同上。
	 */
	private String feature;

	/** 
	* 淘宝交易ID
	 */
	private Long tid;

	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getFeature() {
		return this.feature;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}
	public Long getTid() {
		return this.tid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.logistics.dummy.send";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("feature", this.feature);
		txtParams.put("tid", this.tid);
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

	public Class<LogisticsDummySendResponse> getResponseClass() {
		return LogisticsDummySendResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(tid,"tid");
	}
}
