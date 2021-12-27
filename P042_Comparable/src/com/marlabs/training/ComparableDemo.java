package com.marlabs.training;
import java.util.*;
public class ComparableDemo 
{
public static void main(String[] args) 
{
ArrayList<Student> al=new ArrayList<Student>();
al.add(new Student(101,21,"Trupti"));
al.add(new Student(102,24,"Shubam"));
al.add(new Student(103,22,"Ajay"));
al.add(new Student(104,23,"Madhu"));
Collections.sort(al);
for(Student st:al)
	System.out.println(st.age+"  "+st.rollno+"   "+st.name);
}
}