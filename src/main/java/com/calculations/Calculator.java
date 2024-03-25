package com.calculations;

public class Calculator {

	public int addNumber(int a,int b)
	{
		return a+b;
	}
	public int productOfNumber(int a,int b)
	{
		return a*b;
	}
	public int divisionOfNumber(int a,int b)
	{
		return a/b;
	}
	public int addNumber(int... number)
	{
		int s=0;
		for(int n:number)
		{
			s+=n;
		}
		return s;
	}
	
	
}
