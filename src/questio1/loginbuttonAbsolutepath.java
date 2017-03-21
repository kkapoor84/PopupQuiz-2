package questio1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class loginbuttonAbsolutepath {
	
	public static String passWordTabID="Passwd"; //made it static so no need to create object for this class to call it
	public static String signInID="html/body/div[1]/div[2]/div[2]/div[1]/form/div[2]/div/input[1]";
	public static String userNameLocatorID = "Email";
	public static String nextButtonId = "next";
	public WebDriver driver = null; 

	

	
	@Test (priority=1)	
	public void Driversetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
	}



@Test (priority=2)
	public void sendUserName()
	{
		WebElement ele = driver.findElement(By.id(userNameLocatorID));
		ele.sendKeys("kkapoor84@gmail.com");
		
		
		WebElement nextbutton = driver.findElement(By.id((nextButtonId)));
		nextbutton.click();
		
		
		}

@Test (priority=3)	
public void sendPassword() throws InterruptedException
{
	Thread.sleep(5000);
	WebElement ele = driver.findElement(By.id(passWordTabID));
	ele.sendKeys("07march2005");
	}


@Test (priority=4)
	public void signUpbutton()
	{
		
		WebElement signupbutton = driver.findElement(By.xpath(signInID));
		signupbutton.click();
		driver.quit();
	 	
	}
}
	

