package com.selenium.qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleAndMultiSelectListBox {
	
	static{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Chethan%20DOCS/QSP/HandlingDropdown.html");
		
		WebElement listBox = driver.findElement(By.id("slv"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		
		
		int count = allOptions.size();
		
		for(int i=count-1 ;i>=0; i--) {
			select.selectByIndex(i);
			Thread.sleep(10);
		}
		
		for(int i=count-1; i>=0; i--) {
			select.deselectByIndex(i);
			Thread.sleep(10);
		}
		
		/*** Content of ListBOx in Sorted order without duplicates***/
		Set<String> allList = new TreeSet<String>();
		for(WebElement ele : allOptions){
			allList.add(ele.getText());
		}
		
		//Collections.sort(allList);
		System.out.println(allList);
		
	}

}
