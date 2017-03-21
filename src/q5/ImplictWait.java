package q5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplictWait {
	
	public WebDriver driver=null;
	
	@Test
	public void implicitMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.xpath("//input[@id='u_0_0']")).click();
		
		System.out.println("Done! " +driver.getCurrentUrl());
		driver.quit();
		
		
	}

}
