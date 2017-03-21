package q4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class gmailTitle {
	public static WebDriver driver = null; 

	@Test (priority=1)	
	public void Driversetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		String Actual=driver.getTitle();
		Assert.assertEquals(Actual, "Gmail");
		driver.close();
	}


}
