package com.marlabs.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");

//		boolean status = dao.saveEmployee(new Employee(101, "sandip", 45000.00f));
//		System.out.println(status);

//Boolean status1=dao.updateEmployee(new Employee(101,"shubham",57000.50f));
//System.out.println(status1);

Employee e=new Employee();
e.setId(101);
Boolean status=dao.deleteEmployee(e);
System.out.println(status);

	}
}
