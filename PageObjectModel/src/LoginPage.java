import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {		
		/*userName = driver.findElement(By.id("username"));
		password = driver.findElement(By.name("pwd"));
		loginButton = driver.findElement(By.id("loginButton"));*/
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String un) {
		userName.sendKeys(un);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLogin(){
		loginButton.click();
	}
}
