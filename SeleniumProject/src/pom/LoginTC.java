package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day4.webdriverwaitEg;

public class LoginTC extends Constants
{
	@Test
	public void login()
	{
		driver.get(lp.url);
		driver.manage().window().maximize();
		
		lp.login(lp.u, lp.p);
	
		Sleeper.sleepTightInSeconds(3);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}

}
