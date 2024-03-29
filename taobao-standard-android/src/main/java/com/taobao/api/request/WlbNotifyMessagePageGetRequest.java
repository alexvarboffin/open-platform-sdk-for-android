package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbNotifyMessagePageGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.wlb.notify.message.page.get request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class WlbNotifyMessagePageGetRequest implements TaobaoRequest<WlbNotifyMessagePageGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 查询条件：记录截至时间
	 */
	private Date endDate;

	/** 
	* 通知消息编码：
STOCK_IN_NOT_CONSISTENT---入库单不一致
CANCEL_ORDER_SUCCESS---取消订单成功
INVENTORY_CHECK---盘点
CANCEL_ORDER_FAILURE---取消订单失败
ORDER_REJECT--wms拒单
ORDER_CONFIRMED--订单处理成功
	 */
	private String msgCode;

	/** 
	* 分页查询页数
	 */
	private Long pageNo;

	/** 
	* 分页查询的每页页数
	 */
	private Long pageSize;

	/** 
	* 查询条件：记录开始时间
	 */
	private Date startDate;

	/** 
	* 消息状态：
不需要确认：NO_NEED_CONFIRM
已确认：CONFIRMED
待确认：TO_BE_CONFIRM
	 */
	private String status;

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate() {
		return this.endDate;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getMsgCode() {
		return this.msgCode;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.notify.message.page.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("msg_code", this.msgCode);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_date", this.startDate);
		txtParams.put("status", this.status);
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

	public Class<WlbNotifyMessagePageGetResponse> getResponseClass() {
		return WlbNotifyMessagePageGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
	}
}
