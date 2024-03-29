package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 带分页的淘宝商品
 *
 * @author auto create
 * @since 1.0, null
 */
public class SimbaItemPartition extends TaobaoObject {

	private static final long serialVersionUID = 7641485832881471895L;

	/**
	 * 淘宝商品列表
	 */
	@ApiListField("item_list")
	@ApiField("simba_item")
	private List<SimbaItem> itemList;

	/**
	 * 排序，
True:升级False:降序
	 */
	@ApiField("order_by")
	private Boolean orderBy;

	/**
	 * 排序字段
	 */
	@ApiField("order_field")
	private String orderField;

	/**
	 * 返回第几页的数据从1开始
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页数据大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 所查询的数据总数，只有当返回第一页数据时有值，当要求返回的数据非第一页时，此返回值无效
	 */
	@ApiField("total_item")
	private Long totalItem;

	public List<SimbaItem> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<SimbaItem> itemList) {
		this.itemList = itemList;
	}

	public Boolean getOrderBy() {
		return this.orderBy;
	}
	public void setOrderBy(Boolean orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderField() {
		return this.orderField;
	}
	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalItem() {
		return this.totalItem;
	}
	public void setTotalItem(Long totalItem) {
		this.totalItem = totalItem;
	}

}
