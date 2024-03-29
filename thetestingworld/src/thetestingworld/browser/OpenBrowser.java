package thetestingworld.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class OpenBrowser {
	public WebDriver driver;
	@BeforeMethod
	public void openbrowser()
	{
		driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", ".//Driver/chromedriver.exe");
		driver.navigate().to("http://www.thetestingworld.com");		
	}
	
	@Test(groups={"Reg"})
	public void title()
	{
		String Actual_Title="Testing World Experienced in making experts";
		String T1=driver.getTitle();
		System.out.println(T1);
		
		boolean Title_one=driver.getTitle().equalsIgnoreCase(Actual_Title);
		System.out.println(Title_one);
		
		if (Title_one==true)
		{
			System.out.println("Title matched:- Test Case Passed");
		
		}
		else
		{
			System.out.println("Title Not-matched:- Test Case Failed");

		}
			
	}

	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
}
