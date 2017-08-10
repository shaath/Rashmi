package methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Methods_Reusable
{
	public static WebDriver driver;
	
	public void launch_Br(String br,String url)
	{
		if (br.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
	}
	
	
	public void Screenshot(String name) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Morning1030AM_Rashmi_vinay\\SeleniumProject\\src\\screenshots\\"+name+".png"));
	}

	public void send_text(String Loc, String value, String text)
	{
		if (Loc.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("classname")) 
		{
			driver.findElement(By.className(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("tagname")) 
		{
			driver.findElement(By.tagName(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("xpath")) 
		{
			driver.findElement(By.xpath(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("cssselector")) 
		{
			driver.findElement(By.cssSelector(value)).sendKeys(text);
		}
	}

	public void click(String Loc,String value)
	{
		if (Loc.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(value)).click();
		}
		else if (Loc.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(value)).click();
		}
		else if (Loc.equalsIgnoreCase("classname")) 
		{
			driver.findElement(By.className(value)).click();
		}
		else if (Loc.equalsIgnoreCase("tagname")) 
		{
			driver.findElement(By.tagName(value)).click();
		}
		else if (Loc.equalsIgnoreCase("linktext"))
		{
			driver.findElement(By.linkText(value)).click();
		}
		else if (Loc.equalsIgnoreCase("partiallinktext"))
		{
			driver.findElement(By.partialLinkText(value)).click();
		}
		else if (Loc.equalsIgnoreCase("xpath")) 
		{
			driver.findElement(By.xpath(value)).click();
		}
		else if (Loc.equalsIgnoreCase("cssselector")) 
		{
			driver.findElement(By.cssSelector(value)).click();
		}
	}
}
