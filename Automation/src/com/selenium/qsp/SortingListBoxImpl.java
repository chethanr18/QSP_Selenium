package com.selenium.qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingListBoxImpl {

	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("file:///C:/Chethan%20DOCS/QSP/HandlingDropdown.html");
		
		WebElement listBox = driver.findElement(By.id("slv"));
		
		Select select = new Select(listBox);
		
		List<WebElement> allOptions = select.getOptions();
		
		List<String> allText = new ArrayList<String>();
		
		for(WebElement option : allOptions){
			
			String text = option.getText();
			allText.add(text);
		}
		
		Collections.sort(allText);
		
		System.out.println("Vada found: " +allText.contains("Vada"));
		//Collections.sort(allText,new MyComparator());
		
		//System.out.println(allText);
		for(String text : allText)
			System.out.println(text);
	}
}

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		
		return -(arg0.compareTo(arg1));		
	}
	
}
