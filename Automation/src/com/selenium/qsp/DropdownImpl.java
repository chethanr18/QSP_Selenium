package com.selenium.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownImpl {

	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("file:///C:/Chethan%20DOCS/QSP/HandlingDropdown.html");
		
		WebElement listBox = driver.findElement(By.id("slv"));
		
		Select select = new Select(listBox);
		
		select.selectByIndex(0);
		select.selectByValue("v");
		select.selectByVisibleText("Dosa");
		
		select.deselectByIndex(0);
		select.deselectByValue("d");
		select.deselectByVisibleText("Vada");
//		select.deselectAll();
		
		WebElement listBox2 = driver.findElement(By.id("mtr"));
		
		select = new Select(listBox2);
		
		select.selectByIndex(1);
		select.selectByValue("m");
		select.selectByValue("m");
		
	//	select.deselectAll(); // java.lang.UnsupportedOperationException: You may only deselect all options of a multi-select
		
	//	select.deselectByValue("m");
	//	select.deselectByVisibleText("Coffee");

	}

}
