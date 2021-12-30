
package com.marlabs.training;

import java.io.*;

public class EmployeeDeserializableDemo {
	public static void main(String[] args) throws Exception {
		Employee emp1 = null;
		Employee emp2 = null;
		Employee emp3 = null;
		FileInputStream fos = new FileInputStream("object.txt");
		ObjectInputStream os = new ObjectInputStream(fos);
		emp1 = (Employee) os.readObject();
		emp2 = (Employee) os.readObject();
		emp3 = (Employee) os.readObject();
		fos.close();
		os.close();
		System.out.println("Employee1 Details:");
		System.out.println("the empno is :" + emp1.empno);
		System.out.println("the name is :" + emp1.name);
		System.out.println("the designation is :" + emp1.designation);
		System.out.println("the salary is :" + emp1.salary);

		System.out.println("Employee2 Details:");
		System.out.println("the empno is :" + emp2.empno);
		System.out.println("the name is :" + emp2.name);
		System.out.println("the designation is :" + emp2.designation);
		System.out.println("the salary is :" + emp2.salary);

		System.out.println("Employee2 Details:");
		System.out.println("the empno is :" + emp3.empno);
		System.out.println("the name is :" + emp3.name);
		System.out.println("the designation is :" + emp3.designation);
		System.out.println("the salary is :" + emp3.salary);

	}
}
