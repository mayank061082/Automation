package testcase;

//import org.testng.annotations.Ignore;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.LauchBrowser;
import common.LoginPage;
import common.RegistrationPage;

public class TC_001 extends LauchBrowser{
	//public String Email="prayan2019sus008@stepupschool.in";
	//public String ReEnterEmail="prayan2019sus008@stepupschool.in";
	
	@Test(priority=1)
	public void tc_001()
	{	
		LoginPage lp=new LoginPage();
		lp.openBrowser();
		lp.userName("log_mayank@rediff.com");
		lp.enterPassword("Prayan@0207");
		lp.clickButton();
		lp.closeBrowser();	
		
	}
	@Test(priority=0)
	public void tc_002() throws Exception
	{		
		RegistrationPage rp=new RegistrationPage();	
		rp.openBrowser();
		rp.registrationFirstname("Prayan");
		Thread.sleep(2000);
		rp.registrationLastname("Srivastava");	
		Thread.sleep(2000);
		rp.email("8178969643");
		/*Thread.sleep(2000);
		rp.reEnterEmail("1234567890");*/
			
		rp.newPassword("Mayank@123456");
		Thread.sleep(2000);
		rp.dateOfBirth();
		rp.rdButton();
		rp.submitbtton();
		rp.closeBrowser();		
	}
}
