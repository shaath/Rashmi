package com.SeleniumProject.javaprogrammes;

public class MethodsEg
{
	public static String course="UFT";
	public static void main(String[] args) 
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		m.function3();
		
		boolean result=m.function4();
		System.out.println(result);
	}
	//Static method without returning anyvalue
	
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	//static method with returning value
	
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	//Non static method without returning anyvalue
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	//non static with returning value
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}
	
	public static int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public static double sum(int d, int e,double f)
	{
		double g=d+e+f;
		return g;
	}
}
