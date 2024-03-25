package com.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calculations.Calculator;

public class CalculatorTest {
	
	int counter=0;

//	before all test cases
	@BeforeAll
	public  static void displayStart()
	{
		System.out.println("before all the tests");
		System.out.println("test execution data : "+new Date());
		//		opening file/connection openening all the starting code we can write here
	}
	
	@BeforeEach
	public void beforeEcahTest()
	{
		counter=0;
		System.out.println("it executes before every test cases");
	}
	
	@AfterEach
	public void afterEachTest()
	{
		System.out.println("it executes after every test cases");
	}
	Calculator c=new Calculator();
	@Test
	public void addTwoNumberTest()
	{
		for(int i=0;i<=20;i++)
		{
			counter+=i;
		}
		System.out.println("addition code of 2 numbers");
		int result = c.addNumber(12, 20);
		int expected=32;
		assertEquals(expected, result);
		System.out.println("addition code of 2 numbers");
		System.out.println(counter);
	}

	@Test
	public void addNumberTest()
	{
		for(int i=0;i<=20;i++)
		{
			counter+=i;
		}
		System.out.println("addition code of n numbers");
		int sum = c.addNumber(2,8,7,1,14);
		int expe=32;
		assertEquals(expe, sum);
		System.out.println("addition code of 2 numbers");
		System.out.println(counter);
	}
	
//	after all test cases
	@AfterAll
	public static void dispayEnd()
	{
		//		after executing all the test case if we want close some opening file we can write here
		System.out.println("closing and exiting operation take place in this method");
		System.out.println("ending odf the test date :"+new Date() );
	}
}
