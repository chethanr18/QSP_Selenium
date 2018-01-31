package com.selenium.popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.monsterindia.com/");
		
		Set<String> allWhs = driver.getWindowHandles();
		
		for(String wh : allWhs){
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}
	}

}
