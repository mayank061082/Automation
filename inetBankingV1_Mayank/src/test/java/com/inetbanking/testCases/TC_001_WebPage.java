package com.inetbanking.testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001_WebPage extends Baseclass{
	
	@Test
	public void pageopen()
	{
		
		
		//System.out.println(Title);
		if(driver.getTitle().equalsIgnoreCase(ExpTitle))
		{
			Assert.assertTrue(true, BaseURL);
			System.out.println("Page Title is matach Hence URL is correct");
		}else
		{
			Assert.assertFalse(false, "Wrong URL becoz title not matched");
			System.out.println("Wrong URL");
		}
		
		
	
	}
	
	
}
