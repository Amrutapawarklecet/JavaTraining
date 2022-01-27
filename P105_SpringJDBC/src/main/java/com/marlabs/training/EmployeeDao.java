package com.marlabs.training;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
public class EmployeeDao 
{
private NamedParameterJdbcTemplate jdbcTemplate;

public EmployeeDao(NamedParameterJdbcTemplate jdbcTemplate)
{
	this.jdbcTemplate=jdbcTemplate;
}

public void saveEmployee(Employee e)
{	
	String xyz="insert into employee values(:id,:name,:salary)";
	
	Map<String,Object> map=new HashMap<String,Object>();
	map.put("id", e.getId());
	map.put("name", e.getName());
	map.put("salary", e.getSalary());
	 jdbcTemplate.execute(xyz,map,new PreparedStatementCallback()
			{
		@Override
		public Object doInPreparedStatement(PreparedStatement ps)
				throws SQLException , DataAccessException
				{
			return ps.executeUpdate();
				}
		
			});
			
}

public void updateEmployee(Employee e) {
String xyz="update employee set name=:name, salary=:salary where id=:id";
	
	Map<String,Object> map=new HashMap<String,Object>();
	map.put("name", e.getName());
	map.put("salary", e.getSalary());
	map.put("id", e.getId());
	 jdbcTemplate.execute(xyz,map,new PreparedStatementCallback()
			{
		@Override
		public Object doInPreparedStatement(PreparedStatement ps)
				throws SQLException , DataAccessException
				{
			return ps.executeUpdate();
				}
		
			});
	
}

public void deleteEmployee( Employee e) {
String xyz="delete employee where id=:id";
	
	Map<String,Object> map=new HashMap<String,Object>();
	map.put("id", e.getId());
		 jdbcTemplate.execute(xyz,map,new PreparedStatementCallback()
			{
		@Override
		public Object doInPreparedStatement(PreparedStatement ps)
				throws SQLException , DataAccessException
				{
			return ps.executeUpdate();
				}
		
			});
	
}
}
