package com.SeleniumProject.javaprogrammes;

public class SwitchCaseEg {

	public static void main(String[] args) 
	{
		String Course="Selenium";
		
		switch(Course)
		{
		case "selenium":
			System.out.println("You are selected selenium");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}
	}

}
