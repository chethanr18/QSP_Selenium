package com.selenium.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/********* INCOMPLETE**************/
public class FileDownloadPopup {

	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) {
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--browser.helperApps.neverAsk.saveToDisk=application/zip");*/
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();

	    capabilities.setCapability("marionette", true);
	    WebDriver driver = new FirefoxDriver(capabilities);
		
		
		driver.get("http://www.seleniumhq.org/download/");
		String xp = "//td[.='Java']/..//a[.='Download']";
		
		driver.findElement(By.xpath(xp)).click();
		

	}

}
