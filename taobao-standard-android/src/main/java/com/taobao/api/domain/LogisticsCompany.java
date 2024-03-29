package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 物流公司基础数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsCompany extends TaobaoObject {

	private static final long serialVersionUID = 6441945162985723628L;

	/**
	 * 物流公司代码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 物流公司标识
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 物流公司简称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 运单号验证正则表达式
	 */
	@ApiField("reg_mail_no")
	private String regMailNo;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRegMailNo() {
		return this.regMailNo;
	}
	public void setRegMailNo(String regMailNo) {
		this.regMailNo = regMailNo;
	}

}
