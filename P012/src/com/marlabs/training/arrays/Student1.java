package com.marlabs.training.arrays;

import java.util.*;

public class Student1 {
 
 String rollno,name,address;
 
 void input() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter rollno,name,address");
	 rollno=sc.nextLine();
	 name=sc.nextLine();//Excepts the space in between
	 address=sc.nextLine();
	 
 }
 void display() {
	 System.out.println("The Rollno is:"+rollno);
	 System.out.println("The Name is:"+name);
	 System.out.println("The Address is:"+address);

 }
 
 public static void main(String[] args) {
	Student1[] s1=new Student1[3];
	for(int i=0;i<3;i++) {
		System.out.println("enter the data of student no"+(i+1));
		s1[i]=new Student1();
		s1[i].input();
	}
	
	for(int i=0;i<3;i++) {
		System.out.println("The data of student no:"+(i+1));
		s1[i].display();
	}
	
	
}
	
}
