package com.bank.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest extends Excel implements Constants {
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		System.setProperty(FIREFOXKEY, FIREFOXPATH);
		//System.setProperty(Constants.CHROMEKEY, Constants.CHROMEPATH);
		driver = new FirefoxDriver();
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeApp() {
		driver.quit();
	}
}
