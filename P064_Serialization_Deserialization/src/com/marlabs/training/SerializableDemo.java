//transient :- it is a keyword .this will not be Serialized
package com.marlabs.training;

import java.io.*;

public class SerializableDemo {
	public static void main(String[] args) throws IOException {
		Student obj = new Student();
		obj.rollno = 101;
		obj.name = "sandip";
		obj.address = "bangalore";
		FileOutputStream fos = new FileOutputStream("object.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(obj);
		fos.close();
		os.close();
		System.out.println("Object written into the file.......");
	}
}
