package com.servicetest;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MethodsExampleAsserts {

//	Assertion-> validating the actual value with expected value
//	Assertions class
	@Test
	public void testOne()
	{
		
		System.out.println("testing some assertions method");
		int actual=12;
		int expected=12;
		
		int[] a= {2,8,2,9,5,52};
		int[] b= {2,8,2,9,5,52};
		
		String name= new String("Akhil");
		String expectedname= new String("rahul");
		
//		while comaparing object it comapres the address ans assertSame() compare the object if
//		if yow want comapre contents assertEqaul() use
		
//		Assertions.assertNull(a);
//		Aseertions.assertNotNull()
		
		boolean is=true;
		
		List<Integer> li1=Arrays.asList(10,20,30,40,50);
		List<Integer> li2=Arrays.asList(10,20,30,40,50);
		
		Assertions.assertThrows(RuntimeException.class,() -> {
			throw new RuntimeException("this is testing exception");
		});
		
		Assertions.assertIterableEquals(li2, li1);
		Assertions.assertTrue(is);
		Assertions.assertSame(expectedname,name);
		Assertions.assertEquals(expected, actual);
		Assertions.assertArrayEquals(b, a);
	}
}
