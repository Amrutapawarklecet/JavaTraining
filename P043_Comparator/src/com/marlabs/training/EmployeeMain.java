package com.marlabs.training;

import java.util.*;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, 21, "Shubham"));
		al.add(new Employee(102, 23, "Trupti"));
		al.add(new Employee(103, 22, "Ajay"));
		al.add(new Employee(104, 24, "Kiran"));

//Sorting by age
		Collections.sort(al, new EmployeeAge());
		Iterator<Employee> itr = al.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp.age + "  " + emp.empno + "  " + emp.name);
		}
		System.out.println("***************************************************");
//Sorting by name
		Collections.sort(al, new EmployeeName());
		Iterator<Employee> itr1 = al.iterator();
		while (itr1.hasNext()) {
			Employee emp = itr1.next();
			System.out.println(emp.age + "  " + emp.empno + "  " + emp.name);
		}
	}
}