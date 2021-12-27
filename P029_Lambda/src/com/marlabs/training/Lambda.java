package com.marlabs.training;

@FunctionalInterface
interface Example1 {
	void display();

}

@FunctionalInterface
interface Example2 {
	String name();
}

interface Example3 {
	String Address(String loc);
}

@FunctionalInterface
interface Example4 {
	int sum(int a, int b);
}

public class Lambda {
	public static void main(String[] args) {

		int len = 10, breadth = 20;
		Example1 example1 = () -> {
			System.out.println("Length: " + len);
			System.out.println("Breadth: " + breadth);
			System.out.println("Area: " + (len * breadth));
		};
		example1.display();

		Example2 example2 = () -> {
			return "Lambda Express";
		};
		System.out.println(example2.name());

		Example3 example3 = (loc) -> {
			return "My Location is:" + loc;
		};
		System.out.println(example3.Address("Bangalore"));

		Example4 example4 = (a, b) -> (a + b);

		System.out.println("Sum is" + example4.sum(10, 20));
	}
}
