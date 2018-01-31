package com.bank.test;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bank.generic.BaseTest;
import com.bank.generic.Constants;
import com.bank.pom.HomePage;
import com.bank.pom.LoginPage;


public class Test1_Login extends BaseTest {
	//public WebDriver driver;  /* Creating a WebDriver instance here will not 
								/**** perform any of the steps in the @Test method and throw Exception ***/
	
	@Test(dataProvider="credentials")
	public void test_login1(String userId, String password){
				
		LoginPage lp = new LoginPage(driver);
		//lp.enterUserId(Constants.USER_ID);
		//lp.enterPassword(Constants.PASSWORD);
		lp.enterUserId(userId);
		lp.enterPassword(password);
		lp.clickLogin();
		
		HomePage hp = new HomePage(driver);
		
		if(!isAlertPresent()) {
			if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
				Reporter.log("HomePage Displayed , Login Successfull",true);				
			}
		}
		else{
			Alert al = driver.switchTo().alert();
			if(al.getText().equals("User or Password is not valid")){
				Reporter.log("Login Unsuccessfull with User Id="+userId +" and Password="+ password, true);			
			}
		
		/*else if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
		//if(hp.verifyMarqueeMessage()){
			Reporter.log("HomePage Displayed , Login Successfull",true);
		} else {
			Assert.fail();			
		}*/
		}
	}
	
	//@Test
	public void test_login2() {
		LoginPage lp = new LoginPage(driver);

		lp.enterUserId(getCellData(1, 0));
		lp.enterPassword(getCellData(1, 1));
		lp.clickLogin();
		
		HomePage hp = new HomePage(driver);
		
		Alert al = driver.switchTo().alert();
		if(al.getText().equals("User or Password is not valid")){
			Reporter.log("Login Unsuccessfull", true);
			Assert.fail();
		}
		else if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
			Reporter.log("HomePage Displayed , Login Successfull",true);
		} else {
			Assert.fail();			
		}
	}
	
	@DataProvider(name="credentials")
	public String[][] loginCredentials(){
		
		String[][] id_Password =  new String[4][2];
		int rows = noOfRows(Constants.SHEETNAME);
		System.out.println(rows);
		// i begins with 1 because the data is present in the excel from 1st row and not the 0th row
		for(int i=1,m=0;i<=rows;i++,m++){
			for(int j=0; j<2;j++){
				id_Password[m][j] =getCellData(i,j); 
			}
		}
		return id_Password;
	}
	
	public boolean isAlertPresent() {
		try{
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e){
			Reporter.log("No Alert Present");
			return false;
		}
	}
}
