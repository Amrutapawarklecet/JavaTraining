package com.marlabs.training;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Test 
{
public static void main(String[] args) 
{
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
List<Employee> list=dao.getAllEmployees();

for(Employee e:list)
System.out.println(e);

}
}
