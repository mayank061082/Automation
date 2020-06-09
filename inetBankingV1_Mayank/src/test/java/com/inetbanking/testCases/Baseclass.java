package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Baseclass {
	
	 public static String BaseURL="http://www.shop.thetestingworld.com";
	// public static Uname="mayank";
	 //public static Password="Mayank@123456";
	 public static WebDriver driver;
	 public String ExpTitle="Your Store";
	 
	
	 
	 @BeforeClass
	 public static void openBrowser()
		{
		 
		 	 
		 
	 	 System.setProperty("Webdrive.chrome.driver", "./Driver/chromedriver.exe");	
		//Thread.sleep(3000);
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseURL);
		driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
	 }
	 @AfterClass
	 public static void closebrowser()
	 {
		 driver.quit();
	 }
}
