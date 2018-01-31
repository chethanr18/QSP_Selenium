package com.selenium.testing;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Monster_Resume {
	
	static{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.monsterindia.com/");
		String windowTitle= getCurrentWindowTitle(driver);
		String mainWindowHandle=getMainWindowHandle(driver);
		Assert.assertTrue(closeAllOtherWindows(mainWindowHandle,driver));
		Assert.assertTrue("Main Window Title is not Matching",windowTitle.contains("Monster India"));
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Sign In']")).click();
		driver.findElement(By.id("username_login")).sendKeys("srinivasab@gmail.com");
		Thread.sleep(3000);
		/*WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password_input']")));*/
		driver.findElement(By.xpath("//input[@id='password_input' and @type='password']")).sendKeys("Srini765");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();

	}
	
	public static String getCurrentWindowTitle(WebDriver driver) 
	{
		String WindowTitle=driver.getTitle();
		return WindowTitle;
	}
	
	public static String getMainWindowHandle(WebDriver driver)
	{
		return driver.getWindowHandle();
	}
	
	public  static boolean closeAllOtherWindows(String openWindowHandle,WebDriver driver) 
	{
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String currentWindowHandle: allWindowHandles)
		{
			if(!currentWindowHandle.equals(openWindowHandle))
			{
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		
		}
			driver.switchTo().window(openWindowHandle);
			if (driver.getWindowHandles().size() == 1)
				return true;
			else
				return false;
	}

}
