/*CharArrayWriter/CharArrayReader
------------------------------------------------------------
CharArrayWriter :- it is used to write common data to multiple files.*/
package com.marlabs.training;

import java.io.*;

public class FileExample6 {
	public static void main(String[] args) throws Exception {
		CharArrayWriter caw = new CharArrayWriter();
		caw.write("This is an example of File");
		FileWriter f1 = new FileWriter("test1.txt");
		FileWriter f2 = new FileWriter("test2.txt");
		FileWriter f3 = new FileWriter("test3.txt");
		FileWriter f4 = new FileWriter("test4.txt");
		FileWriter f5 = new FileWriter("test5.txt");
		caw.writeTo(f1);
		caw.writeTo(f2);
		caw.writeTo(f3);
		caw.writeTo(f4);
		caw.writeTo(f5);
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		f5.close();
		System.out.println("success............");
	}
}
