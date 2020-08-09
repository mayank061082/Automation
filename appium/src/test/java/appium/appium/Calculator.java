package appium.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	 //WebDriver driver;
	 static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		
		try {
			cal();
		} catch (Exception exp) {
			
		     exp.printStackTrace();
			System.out.println(exp.getCause());
		}
	}
		
		public static void cal() throws Exception
		{
			DesiredCapabilities cap =new DesiredCapabilities();			
			cap.setCapability("deviceName", "POCO PHONE");
			cap.setCapability("udid", "eed4b780");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "10.1.1");
			cap.setCapability("appPackage", "com.nestik.sql");
			cap.setCapability("appActivity", "com.nestik.sql.MainActivity");
			
			URL url=new URL("http://127.0.0.1:4723/wd/hub");
			driver=new AppiumDriver<MobileElement>(url, cap);			
			System.out.println("Compass application started...");
			}
	}


