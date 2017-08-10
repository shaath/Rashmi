package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArraylistEg {

	public static void main(String[] args)
	{
		ArrayList<Object> s=new ArrayList<Object>();
		//Writing the data into arraylist
		
		s.add("Selenium");
		s.add(40000);
		s.add('M');
		s.add("Apple");
		s.add(true);
		s.add(3, "Sharath");
		
		//Find the size of the arraylist
		System.out.println(s.size());
		
		//Reading the data from arraylist
//		System.out.println(s.get(2));
		for (int i = 0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
		}

	}

}
