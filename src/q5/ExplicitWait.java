package q5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	
	public WebDriver driver = null;
	
	@Test
	public void explicitMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		long t1= System.currentTimeMillis(); //Miliseconds
		
		try
		{
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forgotten accou")));
		}
		catch(Exception e)
		{
			System.out.println("Element not found");
		}
		Long t2 = System.currentTimeMillis();
		
		double t3= (t2-t1) /1000;
		
		System.out.println("Done!" + t3);
		
		driver.findElement(By.linkText("Forgotten account?")).click(); //check this link is clickable or not,if clickable then click
		driver.findElement(By.xpath("//input[@id='u_0_0']")).click();
		driver.quit();
		
		
	}

}
