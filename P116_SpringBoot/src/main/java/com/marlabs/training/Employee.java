/*Wap to create an employee class(empno,name,salary,designation)
perform the insert,update,delete operations.
*/

package com.marlabs.training;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//ctrl+shift+O
@Component
public class Employee implements CommandLineRunner
{
@Autowired  //HAS-A relationship
private JdbcTemplate jt;
@Override
public void run(String... args) throws Exception 
		{
	String sql;
	int count=0;
	
	/*sql="insert into employee values(?,?,?,?)";
	count=jt.update(sql,102,"amruta",25000"Software");
	System.out.println("row inserted"+count);
	*/	

	/* sql="update employee set name=?,salary=?,designation=? where empno=?";

	count=jt.update(sql,"afreen",32000,"Software Engineer",102);

	System.out.println("row updated"+count);
	*/
		sql="delete from employee where empno=?";
	count=jt.update(sql,102);
	System.out.println("row deleted"+count);
		
	}
		}
