package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) 
	{
		int[] Salary={30000,40000,50000,60000,30000};
		//Finding the length of the array
		System.out.println("The length of the array "+Salary.length);
		
		//Reading the data from an array
//		System.out.println(Salary[2]);

//		for (int i = 0; i < Salary.length; i++)
//		{
//			System.out.println(Salary[i]);
//		}
		
		for (int data: Salary) 
		{
			System.out.println(data);
		}
		
	}

}
