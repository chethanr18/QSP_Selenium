package com.selenium.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxImpl {

	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Chethan%20DOCS/QSP/cb.html");
		
		String xp = "//input[@type='checkbox']";
		
		List<WebElement>  allCB = driver.findElements(By.xpath(xp));
		
		int count = allCB.size();
		System.out.println(count);
		
		//check checkboxes in top to bottom order
		for(WebElement cb : allCB) {  //Enhanced for loop
			cb.click();
			Thread.sleep(500);
		}
		
		//check checkboxes in bottom to top order
		for(int i= count-1 ;i>=0;i--) {
			WebElement cb = allCB.get(i);
			cb.click();
			Thread.sleep(500);
		}
		
		

	}

}
