package com.marlabs.training;
public class Student implements Comparable<Student>
{
	int rollno,age;
	String name;

	public Student(int rollno, int age, String name) 
	{
		super();
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Student obj) 
	{
		if(age==obj.age)
		return 0;
		else if(age>obj.age)
			return 1;
		else
			return -1;
	}

}