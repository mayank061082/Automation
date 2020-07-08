package com.mayank;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_001Registration {
	  ChromeDriver driver;
	
	@Test
	public void Registration() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver= new ChromeDriver();
        Thread.sleep(2000);
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElementByName("firstName").sendKeys("mayank");
		driver.findElementByName("lastName").sendKeys("Srivastava");
		driver.findElementByName("phone").sendKeys("9999477909");
		driver.findElementByName("userName").sendKeys("mayank061082");
		driver.findElementByName("address1").sendKeys("A1105 Gardeniana Square");
		driver.findElementByName("city").sendKeys("Ghaziabad");
		Select cont=new Select(driver.findElementByName("country"));
		cont.selectByVisibleText("INDIA");
		driver.findElementByName("email").sendKeys("mayank061082@gmail.com");
		driver.findElementByName("password").sendKeys("mayank@123");
		driver.findElementByName("confirmPassword").sendKeys("mayank@123");
		driver.findElementByName("register").click();
		driver.close();
		driver.quit();
		
		
	}

}
