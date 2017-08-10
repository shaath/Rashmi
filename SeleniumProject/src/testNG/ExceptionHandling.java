package testNG;

import org.testng.SkipException;

public class ExceptionHandling {

	public static void main(String[] args)
	{
		try
		{
		System.out.println(32/0);
		}
		catch(Exception rashmi)
		{
			System.out.println(rashmi);
		}
	}
}
