package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayUserAccountFreezeGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: alipay.user.account.freeze.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class AlipayUserAccountFreezeGetRequest implements TaobaoRequest<AlipayUserAccountFreezeGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 冻结类型，多个用,分隔。不传返回所有类型的冻结金额。
DEPOSIT_FREEZE,充值冻结
WITHDRAW_FREEZE,提现冻结
PAYMENT_FREEZE,支付冻结
BAIL_FREEZE,保证金冻结
CHARGE_FREEZE,收费冻结
PRE_DEPOSIT_FREEZE,预存款冻结
LOAN_FREEZE,贷款冻结
OTHER_FREEZE,其它
	 */
	private String freezeType;

	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}
	public String getFreezeType() {
		return this.freezeType;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "alipay.user.account.freeze.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("freeze_type", this.freezeType);
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

	public Class<AlipayUserAccountFreezeGetResponse> getResponseClass() {
		return AlipayUserAccountFreezeGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
	}
}
