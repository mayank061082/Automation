package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {
        static WebDriver driver;
		public static void main (String []args) throws Exception	{
		System.setProperty("webdriver.chrome.driver", ".//Driver/chromedriver.exe");
		
		FileReader fr=new FileReader("./FileFolder/testData");
		BufferedReader br=new BufferedReader(fr);
		int count=0;
		String line;
		int iteration=0;
		while((line=br.readLine())!=null)
{       count=count+1;

if(count>1){
	iteration=iteration+1;
	String inputdata[]=line.split(",",2);
      	driver=new ChromeDriver();		
	    driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(inputdata[0]);	
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(inputdata[1]);     //  ByXPath("//input[@name='pass']").sendKeys(Password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		String Title=driver.getTitle();
		if	(Title.equals("Facebook"))
		{
			System.out.println(iteration  + "Admin login is successfully -passed");
		}
		else
		{
			System.out.println(iteration  + "Admin login is unsuccessfully -failed");
		}
		//br.close();
		driver.close();
}
}
		br.close();
		fr.close();
}
}
	

