package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
//import org.testng.annotations.BeforeMethod;

public class LauchBrowser {
	
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser() 
	    {
		System.setProperty("webdriver.chrome.driver", ".//Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		driver.quit();
	}

}
