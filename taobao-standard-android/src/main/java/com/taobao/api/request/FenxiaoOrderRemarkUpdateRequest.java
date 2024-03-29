package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoOrderRemarkUpdateResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.fenxiao.order.remark.update request
 * 
 * @author auto create
 * @since 1.0, 2012-08-10 16:38:26
 */
public class FenxiaoOrderRemarkUpdateRequest implements TaobaoRequest<FenxiaoOrderRemarkUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 采购单编号
	 */
	private Long purchaseOrderId;

	/** 
	* 备注旗子(供应商操作)
	 */
	private String supplierMemo;

	/** 
	* 旗子的标记，1-5之间的数字。非1-5之间，都采用1作为默认。
1:红色
2:黄色
3:绿色
4:蓝色
5:粉红色
	 */
	private Long supplierMemoFlag;

	public void setPurchaseOrderId(Long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}
	public Long getPurchaseOrderId() {
		return this.purchaseOrderId;
	}

	public void setSupplierMemo(String supplierMemo) {
		this.supplierMemo = supplierMemo;
	}
	public String getSupplierMemo() {
		return this.supplierMemo;
	}

	public void setSupplierMemoFlag(Long supplierMemoFlag) {
		this.supplierMemoFlag = supplierMemoFlag;
	}
	public Long getSupplierMemoFlag() {
		return this.supplierMemoFlag;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.order.remark.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("purchase_order_id", this.purchaseOrderId);
		txtParams.put("supplier_memo", this.supplierMemo);
		txtParams.put("supplier_memo_flag", this.supplierMemoFlag);
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

	public Class<FenxiaoOrderRemarkUpdateResponse> getResponseClass() {
		return FenxiaoOrderRemarkUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(purchaseOrderId,"purchaseOrderId");
		RequestCheckUtils.checkNotEmpty(supplierMemo,"supplierMemo");
		RequestCheckUtils.checkMaxValue(supplierMemoFlag,5L,"supplierMemoFlag");
		RequestCheckUtils.checkMinValue(supplierMemoFlag,1L,"supplierMemoFlag");
	}
}
