/*File 
-------------
1)It is used to store and manage data.
2)Reading and writing of data into a file can be done using byte stream or character stream.(flow from source to destination)
3)The process of reading and writing object into a file is known as serialization and de-serialization.
4)we will be using java.io package.
5)There are 2 types of stream by which we can read and write data into a file.
a)byte stream
b)character stream
Under this byte stream and charcater stream we have different class.
6)While working with file we have to handle exception because it throws checked Exception.
Exceptions :- EOFException,FileNotFoundException,InterruptedIOException,IOException.
----------------------------------------------------------------------------------
We have some file class methods
--------------------------------------------------*/
//we have to create a file on the project folder
package com.marlabs.training;

import java.io.*;
import java.util.*;

public class FileExample1 {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fname = ob.next();
		File f = new File(fname);
		System.out.println("the file name is " + f.getName());
		System.out.println("the file path is " + f.getPath());
		System.out.println("the file obsolute path is " + f.getAbsolutePath());
		System.out.println("the file is existing " + f.exists());
		System.out.println("the file is in read mode " + f.canRead());
		System.out.println("the file is in write mode " + f.canWrite());
		System.out.println("the file is in execute mode " + f.canExecute());
		System.out.println("the file length is " + f.length());
		System.out.println("this is a file  " + f.isFile());
		System.out.println("this is a directory " + f.isDirectory());
	}
}
