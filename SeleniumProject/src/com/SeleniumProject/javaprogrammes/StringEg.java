package com.SeleniumProject.javaprogrammes;

public class StringEg {

	public static void main(String[] args)
	{
		String name="Rashmi";
		
		int len=name.length();
		
//		for (int i = 0; i < len; i++)
//		{
//			System.out.println(name.charAt(i));
//		}
		
		for (int i = len-1; i >= 0; i--) 
		{
			System.out.print(name.charAt(i));
		}
	}

}
