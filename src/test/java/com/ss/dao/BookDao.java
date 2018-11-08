package com.ss.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ss.mapper.BookMapper;
import com.ss.model.Book;
import com.ss.util.SqlSessionFactorySington;

public class BookDao {
	
	@Test
	public void testOneToOne() {
		SqlSession session = SqlSessionFactorySington.getInstance().getSqlSession(true);
		BookMapper bookMapper = session.getMapper(BookMapper.class);
		Book book = bookMapper.getBookByBookId(123l);
		
		System.out.println();
		System.out.println(book);
		System.out.println();
		
		session.close();
		
	}
	

}
