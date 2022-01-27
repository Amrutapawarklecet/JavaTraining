package com.marlabs.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	public void testMyProg() {
		String s1=new String("abc");
		String s2=new String("abc");
		String s3=null;
		String s4="abc";
		String s5="abc";
		int val1=5;
		int val2=6;
		String[] expectedArray= {"one","two","threee"};
		String[] actualArray= {"one","two","threee"};
		assertEquals(s1, s2);//check for equal are not
		assertTrue(val1<val2);//return in boolean 
		assertFalse(val1>val2);
		assertNotNull(s1);//check object is not null
		assertNotNull(s2);
		assertNull(s3);//used to check null
		assertSame(s4, s5);//check if the object references point to the same 
		assertNotSame(s1, s3);//check if the object references  not point to the same
		assertArrayEquals(expectedArray, actualArray);//check wheter 2 arrays are equal
	}
}
