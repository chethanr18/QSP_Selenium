package test;

import java.util.Set;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

import pom.HomePage;
import pom.NineInchCheeseCakePage;
import pom.TriplceChocCheeseCakePage;
import generic.BaseTest;

public class Scenario1 extends BaseTest {

	@Test
	public void scenario1() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		
		try{
			
			hp.clickNineInchCheeseCake();
		
		} catch(WebDriverException e) {
			hp.clickMaskClose();
			Thread.sleep(5000);
			hp.clickNineInchCheeseCake();
		}
		
		NineInchCheeseCakePage ncp = new NineInchCheeseCakePage(driver);
		ncp.clickTripleChocCheeseCake();
		
		TriplceChocCheeseCakePage tp = new TriplceChocCheeseCakePage(driver);
		tp.clickAddToCartBtn();

		
	}
}
