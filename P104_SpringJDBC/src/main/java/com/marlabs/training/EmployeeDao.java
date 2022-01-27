package com.marlabs.training;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
public class EmployeeDao 
{
private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public Boolean saveEmployee(final Employee e)
{
	String xyz="insert into employee values(?,?,?)";
	return jdbcTemplate.execute(xyz,new PreparedStatementCallback<Boolean>()
			{
		@Override
		public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException , DataAccessException
		{
			ps.setInt(1,e.getId());
			ps.setString(2,e.getName());
			ps.setFloat(3, e.getSalary());
			return ps.execute();
		}
			});
			
}
public Boolean updateEmployee(final Employee e)
{
	String xyz="update employee set name=?,salary=? where id=?";
	return jdbcTemplate.execute(xyz,new PreparedStatementCallback<Boolean>()
			{
		@Override
		public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException , DataAccessException
		{
			ps.setString(1,e.getName());
			ps.setFloat(2, e.getSalary());
			ps.setInt(3,e.getId());
			return ps.execute();
		}
			});
			
}

public Boolean deleteEmployee(final Employee e)
{
	String xyz="delete employee where id=?";
	return jdbcTemplate.execute(xyz,new PreparedStatementCallback<Boolean>()
			{
		@Override
		public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException , DataAccessException
		{
			ps.setInt(1,e.getId());
			return ps.execute();
		}
			});
			
}


}
