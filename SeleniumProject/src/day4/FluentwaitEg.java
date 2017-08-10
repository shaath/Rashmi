package day4;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentwaitEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(40, TimeUnit.SECONDS)
																.pollingEvery(2, TimeUnit.SECONDS)
																.ignoring(NoSuchElementException.class);
								
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[4]/div[1]/div[2]/div/div[2]/div[1]/div/a"))).click();
//		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[2]/div/div[2]/div[1]/div/a")).click();


	}

}
