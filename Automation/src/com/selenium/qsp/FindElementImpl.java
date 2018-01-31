package com.selenium.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * 9th April 2017 - Sunday
 * 
 */
public class FindElementImpl {

	static{
		System.setProperty("webdriver.gecko.driver", "./drivers/chromedriver.exe"); /*NOTE: Driver and names are interchanged*/
		System.setProperty("webdriver.chrom.driver","./drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) {
			
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Chethan%20DOCS/QSP/demo.html");
		
		WebElement element = driver.findElement(By.tagName("a"));
		element.click();
		
	}

}
