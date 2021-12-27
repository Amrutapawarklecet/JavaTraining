package com.marlabs.training;

public class Child  implements Employee,Department{

	
	@Override
	public void display2() {
		System.out.println("Department no is:"+deptno);
		System.out.println("Department name is:"+name);
		System.out.println("Department Location is:"+loc);

	}

	@Override
	public void display1() {
		System.out.println("Emp no is:"+empno);
		System.out.println("Emp name is:"+emp_name);
		System.out.println("Emp address is:"+address);
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.display1();
		c.display2();
	}

}
