package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightCatsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.simba.insight.cats.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class SimbaInsightCatsGetRequest implements TaobaoRequest<SimbaInsightCatsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 查询类目id数组，最大长度200
	 */
	private String categoryIds;

	/** 
	* 主人昵称
	 */
	private String nick;

	public void setCategoryIds(String categoryIds) {
		this.categoryIds = categoryIds;
	}
	public String getCategoryIds() {
		return this.categoryIds;
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
		return "taobao.simba.insight.cats.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_ids", this.categoryIds);
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

	public Class<SimbaInsightCatsGetResponse> getResponseClass() {
		return SimbaInsightCatsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(categoryIds,"categoryIds");
		RequestCheckUtils.checkMaxListSize(categoryIds,200,"categoryIds");
	}
}
