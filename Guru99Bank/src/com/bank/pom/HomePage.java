package com.bank.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.generic.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//marquee[contains(text(),'Welcome To Manager')]")
	WebElement welcomeMessage;
	
	public boolean verifyMarqueeMessage() {
		return welcomeMessage.isDisplayed();
	}
}
