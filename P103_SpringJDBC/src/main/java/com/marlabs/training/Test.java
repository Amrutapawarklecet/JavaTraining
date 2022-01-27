package com.marlabs.training;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class Test 
{
public static void main(String[] args) 
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
	/*int status=dao.saveEmployee(new Employee(101,"sandip",56000.50f));
	System.out.println(status);*/

//	int status1=dao.updateEmployee(new Employee(101,"shubam",57000.50f));
//	System.out.println(status1);

	Employee e=new Employee();
	e.setId(101);
	int status=dao.deleteEmployee(e);
	System.out.println(status);

	}
}

