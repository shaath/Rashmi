package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[5]/div/a")).click();
		
		WebElement f=driver.findElement(By.id("fromCity"));
		Select fDrop=new Select(f);
		
		List<WebElement> flist=fDrop.getOptions();
		
		System.out.println(flist.size());
		
		WebElement t=driver.findElement(By.id("toCity"));
		Select tDrop=new Select(t);
		
		for (int i = 0; i < flist.size(); i++) 
		{
			fDrop.selectByIndex(i);
			String fCity=flist.get(i).getText();
			System.out.println(fCity);
			
			List<WebElement> tlist=tDrop.getOptions();
			for (int j = 0; j < tlist.size(); j++) 
			{
				tDrop.selectByIndex(j);
				String tCity=tlist.get(j).getText();
				
				if (fCity.equalsIgnoreCase(tCity))
				{
					System.out.println("Fail");
				}
				else
				{
					System.out.println("Pass");
				}
			}
		}
	}

}
