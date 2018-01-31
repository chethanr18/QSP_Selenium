package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TriplceChocCheeseCakePage extends BasePage {
	
	@FindBy(xpath="//a[contains(text(),'ADD TO CART')]")
	private WebElement addToCartBtn;

	public TriplceChocCheeseCakePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddToCartBtn(){
		addToCartBtn.click();
	}

}
