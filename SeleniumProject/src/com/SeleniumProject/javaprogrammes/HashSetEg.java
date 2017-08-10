package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) 
	{
		Set<Object> s=new HashSet<Object>();
		//Writing the data into hashset
		s.add("Selenium");
		s.add(true);
		s.add("UFT");
		s.add("Apple");
		s.add('M');
		s.add("Apple");
		
		Iterator<Object> it=s.iterator();
		while(it.hasNext())
		{
			Object data=it.next();
			System.out.println(data);
		}
  
	}

}
