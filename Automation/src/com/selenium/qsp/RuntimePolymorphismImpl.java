package com.selenium.qsp;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphismImpl {

	static{
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	
	public static void testBrowser(WebDriver driver){
		driver.get("http://www.google.com");
		
		System.out.println(driver);
		
		System.out.println(driver.getTitle());
	}
	public static void main(String[] args) {
		
	//	ChromeDriver driver = new ChromeDriver();
	//	testBrowser(driver);
		
		WebDriver driver2 = new FirefoxDriver();
		testBrowser(driver2);

	}

}
