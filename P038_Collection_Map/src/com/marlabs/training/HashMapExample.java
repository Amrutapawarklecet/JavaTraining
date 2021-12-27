package com.marlabs.training;
import java.util.*;
public class HashMapExample 
{
public static void main(String[] args) 
{
	HashMap<Integer,Employee> map=new HashMap<Integer,Employee> ();
	Employee emp1=new Employee(101,"sandip","Bangalore",5600.50f);
	Employee emp2=new Employee(102,"sunil","Bangalore",5700.50f);
	Employee emp3=new Employee(103,"pradeep","Bangalore",5800.50f);
	map.put(101, emp1);
	map.put(102, emp2);
	map.put(103, emp3);
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the empno you want to search");
	int empno=ob.nextInt();
	
	for(Map.Entry<Integer, Employee> m: map.entrySet())
		if(m.getKey()==empno)
		System.out.println(m.getKey()+ "    "+m.getValue());
}
}