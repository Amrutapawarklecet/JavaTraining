package com.marlabs.training;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) throws Exception {
		Function();
	}

	private static void Function() throws ClassNotFoundException, SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao dao = (StudentDao) ctx.getBean("edao");
		boolean status;
		int rollno = 0;
		String name = null;
		String address = null;
		Scanner ob = new Scanner(System.in);
		System.out.println(
				"please enter ur choice:\n" + "1 for display\n" + "2 for insert\n" + "3 for update\n" + "4 for delete\n"+ "5 for display by using rollno ");
		int choice = ob.nextInt();

		switch (choice) {
		case 1:
			List<Student> list = dao.getAllStudent();

			for (Student s : list)
				System.out.println(s);

			Function();
			break;
		case 2:
			System.out.println("enter rollno,name,address");
			rollno = ob.nextInt();
			name = ob.next();
			address = ob.next();
			status = dao.saveStudent(new Student(rollno, name, address));
			if (status == false) {
				System.out.println("Row Inserted");
			}
			Function();
			break;
		case 3:
			System.out.println("enter name,address,rollno");
			name = ob.next();
			address = ob.next();
			rollno = ob.nextInt();
			status = dao.updateStudent(new Student(rollno, name, address));
			if (status == false) {
				System.out.println("Row Updated");
			}
			Function();
			break;

		case 4:
			System.out.println("Enter rollno");
			rollno = ob.nextInt();
			Student s = new Student();
			s.setRollno(rollno);
			status = dao.deleteStudent(s);
			if (status == false) {
				System.out.println("Row Deleted");
			}
			Function();
			break;
		default:
			System.out.println("u have enterd wrong option please enter correct option");
			Function();
			break;
		}
	}
}
