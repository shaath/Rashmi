package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		Object[] s=new Object[5];
		
		//Finding the length of the array
		System.out.println(s.length);

		//Writing the data into array
		s[1]="Selenium";
		s[3]=50000;
		s[3]="Apple";
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}
	}

}
