package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class ScreenShotLib {
	
	public void takeScreenshot(WebDriver driver, String filename) {
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
		File src = efwd.getScreenshotAs(OutputType.FILE);
		File dst = new File(".\\screenshot\\"+filename +".png");
		
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
