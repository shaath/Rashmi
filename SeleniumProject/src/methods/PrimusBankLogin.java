package methods;

import java.io.IOException;

import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class PrimusBankLogin {

	public static void main(String[] args) throws IOException 
	{
		Methods_Reusable m=new Methods_Reusable();
		
		m.launch_Br("chrome", "http://primusbank.qedgetech.com");
		Sleeper.sleepTightInSeconds(5);
		m.send_text("id", "txtuId", "Admin");
		Sleeper.sleepTightInSeconds(5);
		m.send_text("id", "txtPword", "Admin");
		Sleeper.sleepTightInSeconds(5);
		m.click("id", "login");
		Sleeper.sleepTightInSeconds(5);
		m.Screenshot("Primus_Home1");

	}

}
