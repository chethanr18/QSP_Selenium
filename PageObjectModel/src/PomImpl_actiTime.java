import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PomImpl_actiTime {
	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:9090/login.do");

	/*	WebElement userName = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		
		userName.sendKeys("abc");
		password.sendKeys("xyz");
		loginButton.click();
		
		userName.sendKeys("admin");
		password.sendKeys("manager");
		loginButton.click();*/
		
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("abc");
		lp.enterPassword("xyz");
		lp.clickLogin();
		
		//Thread.sleep(1000);
		lp.enterUserName("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		
		driver.quit();
	}

}
