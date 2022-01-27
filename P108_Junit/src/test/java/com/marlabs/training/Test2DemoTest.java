package com.marlabs.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;
import org.junit.jupiter.api.Test;

//annotation class
class Test2DemoTest {

	@BeforeClass
	public static void beforeClass() throws Exception {
		System.out.println("First Before any Execution");
	}

	@Before
	public void beforeMethod() throws Exception {
		System.out.println("Before each Test Execution");
	}

	@Test
	public void testCube() {
		assertEquals(27, Test2Demo.cube(3));
	}

	@Test
	public void reverseWord() {
		//System.out.println(Test2Demo.reverseWord("my name is amruta"));
		assertEquals("ym eman si aturma ", Test2Demo.reverseWord("my name is amruta"));
	}

	@After
	public void afterMethod() throws Exception {
		System.out.println("After each Test Execution");
	}

	@AfterClass
	public static void afterClass() throws Exception {
		System.out.println("Finally After All Execution");
	}

}
