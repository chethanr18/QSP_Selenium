package com.bank.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bank.generic.BasePage;

public class LoginPage extends BasePage {
		
	@FindBy(xpath="//input[@name='uid']")
	public WebElement userIdField;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement passwordField;
	
	@FindBy(name="btnLogin")
	WebElement loginButton;
	
	@FindBy(name="btnReset")
	WebElement resetButton;
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	public  LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserId(String userId) {
	//	wait.until(ExpectedConditions.visibilityOf(userIdField));
		userIdField.sendKeys(userId);
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public void clicReset() {
		resetButton.click();
	}
}
