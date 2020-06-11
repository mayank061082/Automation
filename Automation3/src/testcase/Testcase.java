package testcase;

import org.testng.annotations.Test;

import base.openBrowser;

public class Testcase extends openBrowser  {
	
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(20000);
		driver.findElementById("email").sendKeys("mayank061082");
		Thread.sleep(20000);
		driver.findElementById("pass").sendKeys("jaismadtadii");
		Thread.sleep(20000);
		driver.findElementByXPath("//input[@type='submit']").click();	
	}
	

}
