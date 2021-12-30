//transient :- it is a keyword .this will not be Serialized
package com.marlabs.training;

import java.io.*;

public class EmployeeSerializableDemo {
	public static void main(String[] args) throws IOException {
		Employee e1=new Employee(101, "amruta", "Associative", 30000.00f);
		Employee e2=new Employee(102, "afreen", "Associative", 35000.00f);
		Employee e3=new Employee(103, "abhi", "Associative", 40000.00f);

		FileOutputStream fos = new FileOutputStream("object.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(e1);
		os.writeObject(e2);
		os.writeObject(e3);
		fos.close();
		os.close();
		System.out.println("Object written into the file.......");
	}
}
