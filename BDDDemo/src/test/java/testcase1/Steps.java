package testcase1;

import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation4.BDDDemo.Verify;
import cucumber.api.java.en.*;

public class Steps {
	ChromeDriver  driver;
	@Given("^open URL and open Sign in screen$")
	public void open_URL_and_open_Sign_in_screen() {
		System.setProperty("webdriver.chroe.driver", "./Driver/chrome.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//boolean b= Verify.verifyURL(driver, "http://www.facebook.com");
		//Assert.assertTrue("[Error]:wrong URL",b);	
		
	    
	}

	@When("^enter Username$")
	public void enter_Username() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementById("email").sendKeys("mayank061082");
		
	    
	}

	@When("^enter Password$")
	public void enter_Password() throws InterruptedException {
	    Thread.sleep(2000);
		driver.findElementByName("pass").sendKeys("jaimatadii");
	
	}

	@When("^click on Login button$")
	public void click_on_Login_button() {
		driver.findElementByXPath("//input[@type='submit']").click();
	    
	}

	@Then("^user logged in then URL$")
	public void user_logged_in_then_URL() {
	    System.out.println("Success");
	    
	}



}
