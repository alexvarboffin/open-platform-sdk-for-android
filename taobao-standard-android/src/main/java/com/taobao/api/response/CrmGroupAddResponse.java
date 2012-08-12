package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.group.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGroupAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2739261477153468828L;

	/** 
	 * 新增分组的id
	 */
	@ApiField("group_id")
	private Long groupId;

	/** 
	 * 添加分组是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Long getGroupId( ) {
		return this.groupId;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
