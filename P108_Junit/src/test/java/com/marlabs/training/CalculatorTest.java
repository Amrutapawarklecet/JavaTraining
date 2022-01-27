package com.marlabs.training;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator cal=new Calculator();
	@Test //used to indentify that a method is a test method
	public void testSquare() {
		assertEquals(25, cal.square(5));
		assertEquals(36, cal.square(6));

	}
	
	@Test
	public void testUser() {
		assertEquals("amruta", cal.user("amruta"));
	}
	
	@Test
	public void stringTest() {
		String result=cal.concat("Hello","EveryOne");
		assertEquals("HelloEveryOne",result);
		String s1="Hello";
		String s2="Hello";
		assertSame(s1, s2);
	}
	
	@Test
	public void testAdd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum;
		sum=a+b;
		assertEquals(sum, a+b);
		
	}
	
	@Test
	public void  testSub() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b values");
		int c=sc.nextInt();
		int d=sc.nextInt();
		int sub;
		sub=c-d;
		assertEquals(sub, c-d);
			}

	
	
}
