package testcase1;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation4.BDDDemo.Verify;
import cucumber.api.java.en.*;

public class Steps {
	ChromeDriver  driver;
	@Given("^open URL and open Sign in screen$")
	public void open_URL_and_open_Sign_in_screen() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//boolean b= Verify.verifyURL(driver, "http://www.facebook.com");
		//Assert.assertTrue("[Error]:wrong URL",b);	
		
	    
	}

	@When("^enter Username$")
	public void enter_Username() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.findElementById("email").sendKeys("mayank061082");
		
	    
	}

	@When("^enter Password$")
	public void enter_Password() throws InterruptedException {
	    Thread.sleep(2000);
		driver.findElementByName("pass").sendKeys("prayan@0207");
	
	}

	@When("^click on Login button$")
	public void click_on_Login_button() {
		driver.findElementByXPath("//input[@type='submit']").click();
	    
	}

	@Then("^user logged in then URL$")
	public void user_logged_in_then_URL() {
	    System.out.println("Success");
	    
	}

	@Then("^user close browser$")
	public void user_close_browser() {
	   driver.close();
	}

}
