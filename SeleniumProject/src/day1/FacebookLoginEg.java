package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("gande3@gmail.com");
		
//		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("pass")).sendKeys("12345678900");
		driver.findElement(By.id("loginbutton")).click();
	}

}
