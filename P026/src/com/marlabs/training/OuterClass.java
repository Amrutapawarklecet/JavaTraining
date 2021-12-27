//static class
package com.marlabs.training;

public class OuterClass {
 static int rollno=10;//global variable can be accessed any where within program
 static String name="amruta";
 
 //Inner class can be static
  static class inner{
	   void display() {
		   System.out.println("The rollno is "+rollno);
		   System.out.println("The name is "+name);

	   }
	   
  }
  public static void main(String[] args) {
	OuterClass.inner outer=new OuterClass.inner();
	outer.display();
	
}
}
