package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_logoutTest 
{
	public static WebDriver driver;
	@Given("^Launching the bowser navigate to url$")
	public void launching_the_bowser_navigate_to_url() throws Throwable 
	{
	    driver=new FirefoxDriver();
	    driver.get("http://orangehrm.qedgetech.com");
	}

	@When("^User enters user name and password$")
	public void user_enters_user_name_and_password() throws Throwable 
	{
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^clicks on login$")
	public void clicks_on_login() throws Throwable
	{
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^Welcome message displayed$")
	public void welcome_message_displayed() throws Throwable 
	{
	    String expval="Welcome Admin";
	    String actval=driver.findElement(By.partialLinkText("Welcome")).getText();
	    Assert.assertEquals(expval, actval);
	}

	@When("^Tester Clicks on welcome admin link$")
	public void tester_Clicks_on_welcome_admin_link() throws Throwable 
	{
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.partialLinkText("Welcome")).click();
		
	}

	@When("^also clicks on logout$")
	public void also_clicks_on_logout() throws Throwable
	{
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^Login page displayed$")
	public void login_page_displayed() throws Throwable 
	{
	Sleeper.sleepTightInSeconds(3);
	   String expval="LOGIN";
	   String actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	   Assert.assertEquals(expval, actval);	  		
	}


}
