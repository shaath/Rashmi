package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args)
	{
		//Launching the browser
		FirefoxDriver driver=new FirefoxDriver();
		//Launch the gmail app
		driver.get("http://gmail.com");
		//Maximizes the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Identifying email text box
		WebElement email=driver.findElement(By.id("identifierId"));
		
		//Entering the email id into email text box
		email.sendKeys("testingtoolstrainer449@gmail.com");
		
		//Clicking on next button
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
//		Sleeper.sleepTightInSeconds(10);
		
		//Entering the password into password field
		
		driver.findElement(By.name("password")).sendKeys("123456789");
		//clicking on next button
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	}

}
