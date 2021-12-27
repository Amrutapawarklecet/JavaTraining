//Interface(Multiple Interitance)
package com.marlabs.training;

interface Interface1 {
	int a=10;//By default public static(we can access without object) final(cannot change it)
	void display1();
}

interface Interface2 extends Interface1{
	void display2();
}

interface Interface3 {
	void display3();
}

interface Interface4 {
	void display4();
}

class Demo implements  Interface2, Interface3, Interface4 {

	@Override
	public void display4() {
		System.out.println("Display4");

	}

	@Override
	public void display3() {
		System.out.println("Display3");

	}

	@Override
	public void display2() {
		System.out.println("Display2");

	}

	@Override
	public void display1() {
		System.out.println("Display1");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display1();
		d.display2();
		d.display3();
		d.display4();
		System.out.println("The value of a is:"+a);
	}
}