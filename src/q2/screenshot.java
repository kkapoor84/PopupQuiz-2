package q2;

import java.io.File;
import java.io.IOException;
	
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class screenshot {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchChrome()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	
	driver =new ChromeDriver();
	driver.get("http://www.google.com");
	}
	
	@Test
	public void googleScreenshot()
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
		  FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
		 }	
		  catch (IOException e)
		   {
		    System.out.println(e.getMessage());
		   
		   }
			
	}


}
