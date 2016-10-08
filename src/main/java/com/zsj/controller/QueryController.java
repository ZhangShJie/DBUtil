package com.zsj.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.zsj.model.ColumnBean;
import com.zsj.model.TableBean;

@RestController
public class QueryController {
	@Autowired
	@Qualifier("dataSource")
	DruidDataSource dataSource;
	
	@ResponseBody
	@RequestMapping("/query")
	public String queryColumns(@RequestParam(value="table",required=true) String tableName) throws SQLException {
		Connection connection = dataSource.getConnection();
		PreparedStatement pst = null;
		TableBean tableBean = new TableBean();
		//设置表名
		tableBean.setTableName(tableName);
		//字段集合
		List<ColumnBean> columnBeans = new LinkedList<ColumnBean>();
		
		String columnClassName = "";
		String columnTypeName = "";
		String columnName = "";
		int columnDisplaySize = 0;
		try {
			pst = connection.prepareStatement("select * from "+tableName+" where 1=2");
			ResultSetMetaData rsd = pst.executeQuery().getMetaData();
			//解析各个字段
			for (int i = 0; i < rsd.getColumnCount(); i++) {
				columnClassName = rsd.getColumnClassName(i+1);
				columnTypeName = rsd.getColumnTypeName(i+1);
				columnName = rsd.getColumnName(i+1);
				columnDisplaySize = rsd.getColumnDisplaySize(i+1);
				ColumnBean columnBean = new ColumnBean();
				columnBean.setColumnClassName(columnClassName);
				columnBean.setColumnDisplaySize(columnDisplaySize);
				columnBean.setColumnName(columnName);
				columnBean.setColumnTypeName(columnTypeName);
				columnBeans.add(columnBean);
			}
			tableBean.setColumnBeans(columnBeans);
			return JSON.toJSONString(tableBean,SerializerFeature.DisableCheckSpecialChar);
		} catch (SQLException e) {
			throw e;
		} finally {
			try {
				pst.close();
				connection.close();
				pst = null;
			} catch (SQLException e) {
				throw e;
			}
		}
	}
}
