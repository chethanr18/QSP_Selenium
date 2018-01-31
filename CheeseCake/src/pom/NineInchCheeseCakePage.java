package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class NineInchCheeseCakePage extends BasePage {
	
	@FindBy(xpath="//a[text()='Triple Chocolate Cheesecake - 9 Inch']")
	private WebElement tripleChocCheeseCake;
	
	public NineInchCheeseCakePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickTripleChocCheeseCake(){
		tripleChocCheeseCake.click();
	}

}
