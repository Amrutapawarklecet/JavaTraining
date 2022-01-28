//create table student (id int,name varchar(30),address varchar(30));

package com.marlabs.training;
import java.util.*;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//ctrl+shift+O
@Component
public class MyMessage implements CommandLineRunner
{
@Autowired  //HAS-A relationship
private JdbcTemplate jt;
@Override
public void run(String... args) throws Exception 
		{
	String sql;
	int count=0;
	
	/*sql="insert into student values(?,?,?)";
	count=jt.update(sql,11,"Madhusudhan","Bangalore");
	System.out.println("row inserted"+count);
	*/	

	/* sql="update student set name=?,address=? where id=?";

	count=jt.update(sql,"Madhu","Mumbai",11);

	System.out.println("row updated"+count);
	*/
		sql="delete from student where id=?";
	count=jt.update(sql,11);
	System.out.println("row deleted"+count);
		
	}
		}
