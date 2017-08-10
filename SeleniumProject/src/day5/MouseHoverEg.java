package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import day4.webdriverwaitEg;

public class MouseHoverEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.id("nav-link-shopall"));
		
		Actions act=new Actions(driver);
		act.moveToElement(cat).build().perform();
		Sleeper.sleepTightInSeconds(3);
		WebElement books=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[13]/span"));
		
		act.moveToElement(books).build().perform();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[13]/div/a[7]/span")).click();
	}

}
