package com.SeleniumProject.javaprogrammes;

public class StringEg1 {

	public static void main(String[] args)
	{
		String Course="  Selenium  ";
		//Finding the length of the string
		System.out.println(Course.length());

		System.out.println(Course.charAt(3));
		
		System.out.println(Course.substring(2, 5));
		
		System.out.println(Course.replace("e", "a"));
		
		System.out.println(Course.trim());
		
		System.out.println(Course.toUpperCase());
		
		System.out.println(Course.toLowerCase());
	}

}
