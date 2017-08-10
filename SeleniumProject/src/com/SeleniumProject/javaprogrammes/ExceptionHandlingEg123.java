package com.SeleniumProject.javaprogrammes;

public class ExceptionHandlingEg123 {

	public static void main(String[] args) 
	{
		int a=100;
		int b=500;
		
		if(a>b)
		{
			System.out.println("A is greater");
		}
		else
		{
			throw new ArithmeticException("It's Invalid");
		}

//		try
//		{
//			int c=a/b;
//			System.out.println(c);
//		}
//		catch (Exception e) 
//		{
////			System.out.println(e);
//			System.out.println("Cursor came to catch block");
//		}
//		System.out.println("programme executed");
	}

}
