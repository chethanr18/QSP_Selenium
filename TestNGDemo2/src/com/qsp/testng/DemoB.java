package com.qsp.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends BaseTest {
	
	@Test(priority=100)	
	public void testB(){
		Reporter.log("testB...", true);
	}
	
	@Test(priority=1)
	public void testC(){
		Reporter.log("testC...", true);
	}
}
