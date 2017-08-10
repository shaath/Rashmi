package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutofillersEg {

	public static void main(String[] args) 
	{
//		WebDriver driver=new FirefoxDriver();
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		
		WebDriver driver=new FirefoxDriver(fp);
		
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("spiderman");
		Sleeper.sleepTightInSeconds(3);
		
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='suggestions']/div"));
		
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) 
		{
			String text=list.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("spiderman fidget spinner"))
			{
				list.get(i).click();
				break;
			}
		}
		

	}

}
