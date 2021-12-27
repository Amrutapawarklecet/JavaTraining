//Abstract Class
package com.marlabs.training;

abstract class Abstract1 {
	
	
	abstract void display();

	public int sum(int a, int b) {

		return a + b;

	}
	//Constructor
		//Constructor will executed atomatically because of constructor chaining
		Abstract1(){
			System.out.println("This is Constructor");
		}
		
		Abstract1(int a,int b){
			System.out.println("super constructor sum is:"+(a+b));
		}

}

public class Test extends Abstract1 {

	Test(){
		super();
	}
	Test(int a,int b){
		super(a,b);
	}
	@Override
	void display() {
		System.out.println("This is abstract method");
	}

	public static void main(String[] args) {
		Test t = new Test();
		Test t1 = new Test(10,20);
		t.display();
		System.out.println("Sum is:"+t.sum(10, 20));

	}

}
