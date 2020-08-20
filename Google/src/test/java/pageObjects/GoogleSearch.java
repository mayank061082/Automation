package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Base;

public class GoogleSearch extends Base {
	//WebDriverWait wait = new WebDriverWait(driver, 79);
	
	@Test
	public void search() throws Exception{
		driver.manage().timeouts().pageLoadTimeout(700, TimeUnit.SECONDS);
	    
		driver.get("http://www.google.com/");	
	    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("postman");
	    driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
	   
	    List <WebElement>li = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div/div/span/b[contains(text(),'')]"));
	     System.out.println("Number of Search Elements  >>>>"+li.size());
	   
	     //Thread.sleep(4000);
	   for(int i=0;i<li.size();i++)
	   {
		   System.out.println(" Search Elements text :"+li.get(i).getText());
	   }
		  //driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
		   for(int i=0;i<li.size();i++)
	          if(li.get(i).getText().contains("chrome"))
	              {
			   li.get(i).click();
		       String ExpTitle="postman chrome - Google Search";
		       String Title=driver.getTitle();
			   System.out.println(Title);
			      if(driver.getTitle().equalsIgnoreCase(ExpTitle))
			       {
				Assert.assertTrue(true, "TiTle Matached TEst case passed");
				System.out.println("Page Title is matach Hence URL is correct");
		        }
			      else{
				Assert.assertFalse(false, "Wrong URL becoz title not matched");
				System.out.println("Wrong URL");
			      
			   }
			   
	   }}
}
	

