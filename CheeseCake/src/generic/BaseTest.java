package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConst {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openApplication(){
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		//driver = ChromeDriver(options);
		
		driver = new ChromeDriver(options);
		driver.get("http://www.cheesecake.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void closeApp(){
		//driver.close();
	}

}
