package com.ss.datasource;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0DataSource implements DataSourceFactory {

	@Override
	public void setProperties(Properties props) {
	}

	@Override
	public DataSource getDataSource() {
		return new ComboPooledDataSource();
	}

}
