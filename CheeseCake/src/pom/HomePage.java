package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.BasePage;

public class HomePage  extends BasePage{
	
	@FindBy(xpath="//span[text()='9\" Cheesecakes']/..")
	public WebElement nineInchCheeseCake;
	
	@FindBy(id="close-button")
	public WebElement maskClose;
	
	WebDriverWait wait = new WebDriverWait(driver, 10);

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);		
	}
	
	
	public void clickNineInchCheeseCake(){
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(nineInchCheeseCake)).click();
		//nineInchCheeseCake.click();
	}
	
	public void clickMaskClose() {
		wait.until(ExpectedConditions.visibilityOf(maskClose)).click();
		//maskClose.click();
	}

}
