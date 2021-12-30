
package com.marlabs.training;

import java.io.*;

public class DeserializableDemo {
	public static void main(String[] args) throws Exception {
		Student s1 = null;
		FileInputStream fos = new FileInputStream("object.txt");
		ObjectInputStream os = new ObjectInputStream(fos);
		s1 = (Student) os.readObject();
		fos.close();
		os.close();
		System.out.println("the rollno is :" + s1.rollno);
		System.out.println("the name is :" + s1.name);
		System.out.println("the address is :" + s1.address);
	}
}
