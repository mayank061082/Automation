package automation4.BDDDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public  class Verify {
	
	public static boolean verifyURL(ChromeDriver driver ,String expURL)
	{
		boolean b= false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			b= true;
		}
		return b;
		
	}

}

