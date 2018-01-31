package com.qsp.testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DemoA extends BaseTest {

	@DataProvider
	public String[][] getData() {
		
		String[][] a = new String[][]{{"abc","000"},{"xyz","123"},{"lmn","1818"}};

		return a;
	}
	
	@Test(dataProvider="getData",invocationCount=2)
	public void testA(String a,String b){
		
	 Reporter.log(a + " "+b, true);
	}
	
}
