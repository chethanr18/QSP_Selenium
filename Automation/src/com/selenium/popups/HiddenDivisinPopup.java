package com.selenium.popups;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisinPopup {

	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		WebElement departOn = driver.findElement(By.id("DepartDate"));
		departOn.click();
				
		SimpleDateFormat f = new SimpleDateFormat("d");
		String today = f.format(new Date());
		
		String xpath = "//span[.='July']/../../..//a[.='"+today+"']";
		driver.findElement(By.xpath(xpath)).click();
		
		driver.switchTo().alert().accept();

	}

}