package com.ss.util;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactorySington {
	private final static SqlSessionFactorySington sessionFactorySington = new SqlSessionFactorySington();
	private SqlSessionFactory factory;
	private SqlSessionFactorySington(){
		try {
			factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatisConfig.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static SqlSessionFactorySington getInstance(){
		return sessionFactorySington;
	}
	
	public SqlSession getSqlSession(boolean autoCommit){
		return factory.openSession(autoCommit);
	}
}
