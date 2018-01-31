package com.selenium.qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
	 
	 final String chromeDriver = "webdriver.chrome.driver";
	 
	 final String value = "./drivers/chromedriver.exe";
	 //final String value = ".\\drivers\\chromedriver.exe";
	 
	 System.setProperty(chromeDriver,value);
	 /*
	  * NOTE: Property can also be set using System Env Variable by mentioning the location of the driver inside "Path" variable
	  */
	 
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("file:///C:/Selenium_Dev/Sample.html");
	 
	 String title = driver.getTitle();
	 System.out.println("Title of the Page: " + title);
	 	 
	 String url = driver.getCurrentUrl();
	 System.out.println("URL of the Page: " + url);
	 
	 String src = driver.getPageSource();
	 System.out.println("Page Source: " + src);
	 
	 driver.manage().window().maximize();

	 driver.quit();
	}

}
