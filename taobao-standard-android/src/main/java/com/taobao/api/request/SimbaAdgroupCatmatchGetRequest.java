package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaAdgroupCatmatchGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.simba.adgroup.catmatch.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class SimbaAdgroupCatmatchGetRequest implements TaobaoRequest<SimbaAdgroupCatmatchGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 推广组Id
	 */
	private Long adgroupId;

	/** 
	* 主人昵称
	 */
	private String nick;

	public void setAdgroupId(Long adgroupId) {
		this.adgroupId = adgroupId;
	}
	public Long getAdgroupId() {
		return this.adgroupId;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.simba.adgroup.catmatch.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("adgroup_id", this.adgroupId);
		txtParams.put("nick", this.nick);
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

	public Class<SimbaAdgroupCatmatchGetResponse> getResponseClass() {
		return SimbaAdgroupCatmatchGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(adgroupId,"adgroupId");
	}
}
