package com.zsj.model;

public class ColumnBean {
	/**
	 * java����
	 */
	private String columnClassName;
	/**
	 * ���ݿ�����
	 */
	private String columnTypeName;
	/**
	 * �ֶ���
	 */
	private String columnName;
	/**
	 * �ֶγ���
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
