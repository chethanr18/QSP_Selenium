package com.selenium.popups;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
		rt.exec("C:\\EclipseWorkspace\\QSPSelenium\\Automation\\script.exe");

	}

}
