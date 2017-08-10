package com.SeleniumProject.javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args)
	{
		Object[][] x=new Object[3][2];
		//Finding the length of the rows
		System.out.println(x.length);
		//Finding the length of the columns
		System.out.println(x[0].length);
		
		//Writing the data into arary
		x[0][1]="Selenium";
		x[1][0]=30000;
		x[2][1]="UFT";
		
		
		//Reading the data from array
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++)
			{
				System.out.println(x[i][j]);
			}
		}
		
	}

}
