package com.selenium.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_findElement {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Chethan%20DOCS/QSP/table.html");
		
		WebElement table1 = driver.findElement(By.id("t1"));
			
		List<WebElement> list1 = table1.findElements(By.xpath(".//td"));
		
		for(WebElement e : list1) {
			System.out.print(e.getText() + ", ");
		}

	}

}
