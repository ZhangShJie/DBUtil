package com.zsj.model;

import java.util.List;

public class TableBean {
	/**
	 * 表名
	 */
	private String tableName;
	/**
	 * 字段集合
	 */
	private List<ColumnBean> columnBeans;
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public List<ColumnBean> getColumnBeans() {
		return columnBeans;
	}
	public void setColumnBeans(List<ColumnBean> columnBeans) {
		this.columnBeans = columnBeans;
	}
	
}
