package com.marlabs.training.constructor;

public class Test {
 public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setEmpno(101);
	emp.setName("amruta");
	emp.setDesignation("Software Engineer");
	emp.setSalary(30000.45f);
	System.out.println(emp.getEmpno());
	System.out.println(emp.getName());
	System.out.println(emp.getDesignation());
	System.out.println(emp.getSalary());

}
}
