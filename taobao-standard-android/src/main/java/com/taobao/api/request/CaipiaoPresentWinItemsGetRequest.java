package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CaipiaoPresentWinItemsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.caipiao.present.win.items.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class CaipiaoPresentWinItemsGetRequest implements TaobaoRequest<CaipiaoPresentWinItemsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 查询个数，最大值为50.如果为空、0和负数，则取默认值50
	 */
	private Long num;

	/** 
	* 淘宝数字ID，不可为空，0和负数。
	 */
	private Long userNumId;

	public void setNum(Long num) {
		this.num = num;
	}
	public Long getNum() {
		return this.num;
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
		return "taobao.caipiao.present.win.items.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("num", this.num);
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

	public Class<CaipiaoPresentWinItemsGetResponse> getResponseClass() {
		return CaipiaoPresentWinItemsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(userNumId,"userNumId");
	}
}
