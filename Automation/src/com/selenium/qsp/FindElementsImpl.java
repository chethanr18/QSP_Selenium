package com.selenium.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsImpl {

	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Chethan%20DOCS/QSP/April22.html");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int count = allLinks.size();
		System.out.println(count);
		
		int i1 =10;
		Integer i2 = new Integer(10); //Wrapper Class
	
		System.out.println("variable i: " + i1);
		System.out.println("Wrapper class Integer i: " + i2);
		
		for(int i = 0 ; i<count ; i++) {
			WebElement ele = allLinks.get(i);
			String text = ele.getText();
			System.out.println(text);
		}

	}

}
