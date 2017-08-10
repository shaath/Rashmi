package com.SeleniumProject.javaprogrammes;

public class NestedIfEg2 {

	public static void main(String[] args) 
	{
		String course="Selenium";
		
		if (course.equalsIgnoreCase("selenium")) 
		{
			System.out.println("You are selected Selenium");
		}
		else if (course.equalsIgnoreCase("Manual")) 
		{
			System.out.println("You are selected Manual");
		}
		else if (course.equalsIgnoreCase("UFT"))
		{
			System.out.println("You are selected UFT");
		}
		else
		{
			System.out.println("Slect a proper course");
		}

	}

}
