package com.marlabs.training;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class MaxNumberTest {

	@Test
	public void testFindMax() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  maximum number");
		int max=sc.nextInt();
	    
		assertEquals(max, MaxNumber.findMax(new int[] {1,2,3,4}));
	}

}
