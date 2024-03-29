package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGroupUpdateResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.crm.group.update request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class CrmGroupUpdateRequest implements TaobaoRequest<CrmGroupUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 分组的id
	 */
	private Long groupId;

	/** 
	* 新的分组名，分组名称不能包含|或者：
	 */
	private String newGroupName;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Long getGroupId() {
		return this.groupId;
	}

	public void setNewGroupName(String newGroupName) {
		this.newGroupName = newGroupName;
	}
	public String getNewGroupName() {
		return this.newGroupName;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.group.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("group_id", this.groupId);
		txtParams.put("new_group_name", this.newGroupName);
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

	public Class<CrmGroupUpdateResponse> getResponseClass() {
		return CrmGroupUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(groupId,"groupId");
		RequestCheckUtils.checkMinValue(groupId,1L,"groupId");
		RequestCheckUtils.checkNotEmpty(newGroupName,"newGroupName");
		RequestCheckUtils.checkMaxLength(newGroupName,15,"newGroupName");
	}
}
