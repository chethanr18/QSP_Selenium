import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class IdentifyDuplicate {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Chethan%20DOCS/QSP/New/table.html");
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		Map<WebElement,WebElement> map = new LinkedHashMap<WebElement, WebElement>();

		List<WebElement> l1 = new LinkedList<WebElement>();
		List<WebElement> l2 = new LinkedList<WebElement>();
		
		String xpath = "//td[text()='srinivasa@gmail.com']";
		String xpath2 ="//td[text()='srinivasa@gmail.com']/../td[2]/a";
		
		l1 = driver.findElements(By.xpath(xpath));
		l2 = driver.findElements(By.xpath(xpath2));
			
		for(int i=0 ; i<l1.size();i++) {
			WebElement ele = l1.get(i);
			WebElement ele2 = l2.get(i);
			map.put(ele, ele2);			
		}
		
		//System.out.println(map);
		List<WebElement> l3 = new LinkedList<WebElement>();
		
		for(int i = 1; i<l1.size();i++){
			WebElement ele = l1.get(i);
			WebElement ele2 = map.get(ele);
			l3.add(ele2);
		}
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		for(WebElement e : l3) {
					
			e.click();
			Thread.sleep(5000);
			driver.navigate().back();
			wait.until(ExpectedConditions.stalenessOf(e));	
		}
		
		
	}

}
