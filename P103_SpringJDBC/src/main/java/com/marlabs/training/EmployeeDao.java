package com.marlabs.training;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao 
{
private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public int saveEmployee(Employee e)
{
	String xyz="insert into employee values(' "+e.getId()+ " ',' "+e.getName()+" ',' "+e.getSalary()+" ')";
	return jdbcTemplate.update(xyz);	
}

public int updateEmployee(Employee e)
{
	String xyz="update employee set name=' "+e.getName()+" ',salary=' "+e.getSalary() +" ' where id=' "+e.getId()+" ' ";
				return jdbcTemplate.update(xyz);	
}

public int deleteEmployee(Employee e)
{
	String xyz="delete from employee where id=' "+e.getId()+" ' ";
	return jdbcTemplate.update(xyz);	
}
}