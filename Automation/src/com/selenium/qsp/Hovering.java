package com.selenium.qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hovering {
	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {

		/*ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=800,480");*/
 
        /*DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);*/
        
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.actimind.com");
		
		
		//driver.manage().window().setSize(new Dimension(300, 400));
		String xp = "//span[.='About Company']";
		WebElement menu = driver.findElement(By.xpath(xp));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(menu);
		actions.perform();
	
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\test.png"));

	}

}
