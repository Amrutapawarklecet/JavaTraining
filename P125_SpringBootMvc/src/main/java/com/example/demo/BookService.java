package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BookService {

	@Autowired
	SessionFactory sessionFactory;
	JdbcTemplate jt;
	
	private Object currentSession() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession();
	}
	public List<BookDemo> getAll()
	{
		return ((SharedSessionContract) currentSession()).createCriteria(BookDemo.class).list();
	}
	/*{
		return jt.query("select * from Book", new RowMapper<BookDemo>()
		{
			public BookDemo mapRow(ResultSet rs,int rownumber)throws SQLException
			{
				BookDemo e=new BookDemo();
				e.setBookid(rs.getString(1));
				e.setBookname(rs.getString(2));
				e.setAuthor(rs.getString(3));
				e.setPrice(rs.getString(4));
				System.out.println(e);
				return e;
			}
		});			
	}*/
	
	

}
