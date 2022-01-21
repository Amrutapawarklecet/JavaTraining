package com.marlabs.training;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) 
	{
	Resource res=new ClassPathResource("applicationContext.xml");//Takes the path of the xml file.
	BeanFactory fact=new XmlBeanFactory(res);
	
	Employee emp=(Employee)fact.getBean("obj1");
	emp.display();
	
	Employee emp1=(Employee)fact.getBean("obj2");
	//emp1.display();
	
	
	}

}
