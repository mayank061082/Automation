package common;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.LauchBrowser;

public class RegistrationPage  extends LauchBrowser{
	
	

	public void registrationFirstname(String firstname)
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
	}
	public void registrationLastname(String lastname)
	{
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
	}
	public void email(String Email)
	{
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(Email);
	}
	/*public void reEnterEmail(String ReEnterEmail)
	{
		
		driver.findElement(By.xpath("//input[@id='u_0_u'])")).sendKeys(ReEnterEmail);
	}*/
		
	
	/*public void reEnterEmail(String ReEnterEmail)
	{
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__'])")).sendKeys(ReEnterEmail);
		String Email = null;
		if(Email==ReEnterEmail)
		{
			System.out.println("Enter email is correct");
		}
	}*/
	public void newPassword(String NPassword)
	{
		driver.findElement(By.xpath("//input[@type='Password' or @name='reg_passwd__']")).sendKeys(NPassword);
	}
	
	public void dateOfBirth()
	{
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS); 
		Select db=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		db.selectByVisibleText("2");
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS); 
	
		Select dm=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		dm.selectByVisibleText("Jul");
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS); 
		
		Select dy=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		dy.selectByVisibleText("2015");
		
	}
	public void rdButton()
	{
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS); 
		driver.findElement(By.cssSelector("input[value='2']")).click();		
		
	}
	public void submitbtton()
	{
		driver.findElement(By.name("websubmit")).click();
	}
	
		
		
	}

