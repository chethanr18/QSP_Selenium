package com.selenium.testing;

import javax.servlet.annotation.WebListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartMobilePrice {
	
	static{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
	//	driver.get("https://www.flipkart.com/search?q=samsung&otracker=start&as-show=on&as=off");
	//	driver.manage().window().maximize();
		
		driver.get("http://www.flipkart.com");
		WebElement searchInput = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		searchInput.sendKeys("samsung");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		searchButton.click();
		
		String nameOfTheSamsungPhone = "SAMSUNG Guru 1200";
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'"+nameOfTheSamsungPhone+"')]/..//a[3]/div/div")));
		//WebElement element = driver.findElement(By.xpath("//a[contains(.,'"+nameOfTheSamsungPhone+"')]/..//a[3]/div/div"));
		String price = element.getText();
		System.out.println("The price of the phone " + nameOfTheSamsungPhone +" is  Rs." + price.substring(1));
		
	}

}
