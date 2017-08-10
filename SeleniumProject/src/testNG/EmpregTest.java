package testNG;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpregTest extends TestNGMaster
{
	@Test(dataProvider="data")
	public void org_Empreg(String fn, String ln)
	{
		expval=fn+" "+ln;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fn);
		driver.findElement(By.id("lastName")).sendKeys(ln);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval, "Empreg Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x=new Object[2][2];
		
		x[0][0]="Sharath";
		x[0][1]="Chandra";
		
		x[1][0]="Rashmi";
		x[1][1]="Rashmi";
		
		return x;
		
	}

}