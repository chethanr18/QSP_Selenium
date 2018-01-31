package com.selenium.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.actimind.com/contact.php");
		
		String xpath = "//input[@type='file']";
		driver.findElement(By.xpath(xpath)).sendKeys("E:\\Chethan DOCS\\DL.dubaak");
	}

}
