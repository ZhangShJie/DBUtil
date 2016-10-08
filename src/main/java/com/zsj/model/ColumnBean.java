package com.zsj.model;

public class ColumnBean {
	/**
	 * java类型
	 */
	private String columnClassName;
	/**
	 * 数据库类型
	 */
	private String columnTypeName;
	/**
	 * 字段名
	 */
	private String columnName;
	/**
	 * 字段长度
	 */
	private int columnDisplaySize;
	public String getColumnClassName() {
		return columnClassName;
	}
	public void setColumnClassName(String columnClassName) {
		this.columnClassName = columnClassName;
	}
	public String getColumnTypeName() {
		return columnTypeName;
	}
	public void setColumnTypeName(String columnTypeName) {
		this.columnTypeName = columnTypeName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public int getColumnDisplaySize() {
		return columnDisplaySize;
	}
	public void setColumnDisplaySize(int columnDisplaySize) {
		this.columnDisplaySize = columnDisplaySize;
	}
	
}
