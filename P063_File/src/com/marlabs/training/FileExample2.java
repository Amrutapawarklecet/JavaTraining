/*Byte stream(10101001001)
---------------------
There are 2 abstract classes.
--------------------------------------------
1)InputStream-reading data from the file.
2)OutputStream-writing data into the file.

we have some classes 
1)BufferInputStream/BufferOutputStream
2)FileInputStream/FileOutputStream
3)ObjectInputStream/ObjectOutputStream ----serialization and de-serialization.
4)DataInputStream/DataOutputStream ----to read and write primative data type into the file.
*/
package com.marlabs.training;

import java.io.*;

public class FileExample2 {
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("student.txt");// file not found means it will automatically create
																	// a file
		System.out.println("enter the data");
		int data;
		while ((data = dis.read()) != '\n') // data is internally converted into byte format and while writing it will
											// again convert into //character
		{
			fos.write(data);
		}
		System.out.println("file writing over");
		dis.close(); // pointer will be released.
		fos.close();
	}
}
