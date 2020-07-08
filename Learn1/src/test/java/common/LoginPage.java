package common;


//import java.io.File;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.*;

import base.LauchBrowser;


public class LoginPage extends LauchBrowser {
	
	/*		try {
		File f=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File f1=new File("./ScreenShot/Image1.png");		
		FileHandler.copy(f, f1);
		} catch (Exception e) {
		e.printStackTrace();
		}
			*/
	
		
	public void userName(String name)
	{
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(name);
	}
	
	public void enterPassword(String Password)
	{
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Password);     //  ByXPath("//input[@name='pass']").sendKeys(Password);
	}
	
	public void clickButton()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
