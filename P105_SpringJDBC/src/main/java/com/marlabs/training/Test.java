package com.marlabs.training;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Test 
{
public static void main(String[] args) 
{
Resource ctx=new ClassPathResource("applicationContext.xml");
BeanFactory fact=new XmlBeanFactory(ctx);

EmployeeDao dao=(EmployeeDao)fact.getBean("edao");
//dao.saveEmployee(new Employee(105,"Kiran",45000.00f));
//System.out.println("Row Inserted");

//dao.updateEmployee(new Employee(105,"shubam",57000.50f));
//System.out.println("Row Updated");

Employee e=new Employee();
e.setId(105);
dao.deleteEmployee(e);
System.out.println("Row Deleted");

}
}
