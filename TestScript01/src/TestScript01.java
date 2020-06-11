/*
 * Set of test script for testing Website Guru99 Bank
 * The test scripts is developed using Selenium Framework
 *
 */
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


/**
 * 
 * @author Krishna Rungta
 *        Test Script 01
 *        ************** 
 *        Test Steps
 *        1)  Go to http://www.demo.guru99.com/V4/
          2) Enter valid UserId
          3) Enter valid Password
          4) Click Login
 */

public class TestScript01 {

    @Test

    public void TC001() throws InterruptedException
    {
	
    	//Setup Firefox driver    	
    	
    	System.setProperty("webdriver.chrome.driver", "./Driver/chrome.exe");
    	WebDriver driver = new ChromeDriver();
    	Thread.sleep(2000);
    	String baseUrl = "www.demo.guru99.com/V4/";
    	
    	// launch Firefox and direct it to the Base URL
    	driver.get(baseUrl);


	    // Enter username
    	Thread.sleep(1000);
	    driver.findElement(By.name("uid")).sendKeys("mngr1336");

	    // Enter Password
	    Thread.sleep(1000);
	    driver.findElement(By.name("password")).sendKeys("dAnavUq");
   
	    // Click Login
	    Thread.sleep(12000);
	    driver.findElement(By.name("btnLogin")).click();


	    }
}
	

    

