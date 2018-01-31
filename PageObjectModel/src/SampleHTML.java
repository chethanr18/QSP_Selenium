import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class SampleHTML {
	
	@FindBy(xpath="//td[text()='srinivasa@gmail.com']")
	private List<WebElement> list1;
	
	@FindBy(xpath="//td[text()='srinivasa@gmail.com']/../td[2]/a")
	private List<WebElement> list2;
	
	public SampleHTML(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void click(){
		
	}

}
