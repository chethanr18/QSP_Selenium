import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Monster_Resume 
{
	static WebDriver driver;
static
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
}

public static void main() throws InterruptedException, AWTException, IOException {
	Monster_Profile_Update();	
}

	//@Test

	public static void Monster_Profile_Update() throws InterruptedException, AWTException, IOException 
	{
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
		//driver=new FirefoxDriver();
		driver.get("http://www.monsterindia.com/");
		String windowTitle= getCurrentWindowTitle();
		String mainWindowHandle=getMainWindowHandle(driver);
		Assert.assertTrue(closeAllOtherWindows(mainWindowHandle));
		Assert.assertTrue("Main Window Title is not Matching",windowTitle.contains("Monster India"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Sign In']")).click();
		driver.findElement(By.id("username_login")).sendKeys("srinivasab@gmail.com");
		Thread.sleep(3000);
		/*WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password_input']")));*/
		driver.findElement(By.xpath("//input[@id='password_input' and @type='password']")).sendKeys("Srini765");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
	}

	
	public static String getCurrentWindowTitle() 
	{
		String WindowTitle=driver.getTitle();
		return WindowTitle;
	}
	
	public static String getMainWindowHandle(WebDriver driver)
	{
		return driver.getWindowHandle();
	}
	
	public  static boolean closeAllOtherWindows(String openWindowHandle) 
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
	
	

