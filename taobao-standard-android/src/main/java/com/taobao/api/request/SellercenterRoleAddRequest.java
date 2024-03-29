package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SellercenterRoleAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.sellercenter.role.add request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class SellercenterRoleAddRequest implements TaobaoRequest<SellercenterRoleAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 角色描述
	 */
	private String description;

	/** 
	* 角色名
	 */
	private String name;

	/** 
	* 表示卖家昵称
	 */
	private String nick;

	/** 
	* 需要授权的权限点permission_code列表,以","分割.其code值可以通过调用taobao.sellercenter.user.permissions.get返回，其中permission.is_authorize=1的权限点可以通过本接口授权给对应角色。
	 */
	private String permissionCodes;

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return this.description;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setPermissionCodes(String permissionCodes) {
		this.permissionCodes = permissionCodes;
	}
	public String getPermissionCodes() {
		return this.permissionCodes;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.sellercenter.role.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("description", this.description);
		txtParams.put("name", this.name);
		txtParams.put("nick", this.nick);
		txtParams.put("permission_codes", this.permissionCodes);
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

	public Class<SellercenterRoleAddResponse> getResponseClass() {
		return SellercenterRoleAddResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxLength(description,20,"description");
		RequestCheckUtils.checkNotEmpty(name,"name");
		RequestCheckUtils.checkMaxLength(name,20,"name");
		RequestCheckUtils.checkNotEmpty(nick,"nick");
		RequestCheckUtils.checkMaxLength(nick,500,"nick");
		RequestCheckUtils.checkMaxListSize(permissionCodes,2000,"permissionCodes");
	}
}
