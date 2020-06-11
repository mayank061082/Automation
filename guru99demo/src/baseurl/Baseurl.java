package baseurl;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Baseurl {
	
	public ChromeDriver driver;

	@BeforeTest
	public void Beforetest()
	{
		System.setProperty("webdriver.chroe.driver", "./Driver/chrome.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
				
	}
	
	@AfterTest
	public void Aftertest()
	{
		driver.close();
	
	}

}
