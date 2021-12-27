package com.marlabs.training;

import java.util.*;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, 24000, "Shubham"));
		al.add(new Employee(102, 22000, "Trupti"));
		al.add(new Employee(103, 25000, "Ajay"));
		al.add(new Employee(104, 21000, "Kiran"));

//Sorting by salary
		Collections.sort(al, new EmployeeSalary());
		Iterator<Employee> itr = al.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp.salary + "  " + emp.empno + "  " + emp.name);
		}

	}
}