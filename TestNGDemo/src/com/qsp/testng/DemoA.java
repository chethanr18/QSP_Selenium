package com.qsp.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {

	@Test
	public void testMethod(){
		Reporter.log("Demo TestNG", true);
	}
}
