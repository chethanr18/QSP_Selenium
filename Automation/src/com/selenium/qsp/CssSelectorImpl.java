package com.selenium.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorImpl {

	static{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe"); /*NOTE: Driver and names are interchanged*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Chethan%20DOCS/QSP/demo.html");
		
		//driver.findElement(By.cssSelector("a[id='q1']")).click();
		
		//driver.findElement(By.cssSelector("a#q1")).click();
		
		driver.findElement(By.cssSelector(".c1")).click();
		
		
		
	}

}
