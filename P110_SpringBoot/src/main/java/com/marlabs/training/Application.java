package com.marlabs.training;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		MyMessage mm = ac.getBean("msg", MyMessage.class);
		mm.welcome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The sum is " + mm.sum(a, b));
		System.out.println("The sub is " + mm.sub(a, b));
		System.out.println("The mul is " + mm.mul(a, b));
		System.out.println("The div is " + mm.div(a, b));
		Employee mm2 = ac.getBean("emp", Employee.class);
		Employee e = new Employee();
		e.intput();
		e.display();
	}

}
