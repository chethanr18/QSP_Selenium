package com.selenium.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsImpl {

	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Chethan%20DOCS/QSP/demo.html");
		Thread.sleep(1000);
		
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.id("q1")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.name("n1")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.className("c1")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.linkText("Qspiders")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("spiders")).click();
		Thread.sleep(1000);
		
	}

}
