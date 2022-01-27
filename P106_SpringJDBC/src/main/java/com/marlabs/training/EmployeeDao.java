package com.marlabs.training;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
public class EmployeeDao 
{
private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

public List<Employee> getAllEmployees()
{
	return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>()
			{
			public List<Employee> extractData(ResultSet rs)throws SQLException,DataAccessException
			{
				List<Employee> list=new ArrayList<Employee>();
				while(rs.next())
				{
		Employee e=new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setSalary(rs.getFloat(3));
	list.add(e);
			}
				return list;
			}
			});			
			}
}




