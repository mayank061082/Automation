package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatementLib {
	
	public static void isleep(int timeinsec) {
		try {
		Thread.sleep(timeinsec*1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void iWaitForSec(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public static void iWaitForMin(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
	}

	public static void eWaitforVisible(WebElement ele, WebDriver driver, int timeinsec) {
		WebDriverWait wait = new WebDriverWait(driver, timeinsec);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void eWaitForClickable(WebElement ele, WebDriver driver, int timeinsec) {
		WebDriverWait wait = new WebDriverWait(driver, timeinsec);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public static void eWaitForTitle(String title, WebDriver driver, int timeinsec) {
		WebDriverWait wait = new WebDriverWait(driver, timeinsec);
		wait.until(ExpectedConditions.titleIs(title));
	}

}
