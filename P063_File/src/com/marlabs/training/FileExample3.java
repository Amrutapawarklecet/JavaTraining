//Reading data from one file and writing data into another file.
package com.marlabs.training;
import java.io.*;
public class FileExample3 
{
public static void main(String[] args)throws Exception
{
	FileInputStream fis=new FileInputStream("student.txt");//read from the file(it should exists or have to create)
	FileOutputStream fos=new FileOutputStream("student1.txt");//write data into the file.(automatic create)
	int data;
	while((data=fis.read())!=-1)//-1 indicates end of the file.
	{
		fos.write(data);
	}
	fis.close();fos.close();
	System.out.println("file copied...................");
}
}