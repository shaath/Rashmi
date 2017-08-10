package com.SeleniumProject.javaprogrammes;

public class ReuseEg 
{
	public static void main(String[] args) 
	{
		MethodsEg m=new MethodsEg();
		
		m.function1();
		System.out.println("You are selected "+m.course);
		
		double res=m.sum(400,600,500);
		System.out.println(res);
	}

}
