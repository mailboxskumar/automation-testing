package com.qa.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {

	public String URL = "https://opensource-demo.orangehrmlive.com/";
	public WebDriver driver;
	
	public void driverSetup(String browserName) {

		switch (browserName.toUpperCase()) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		driver.get(URL);
		driver.manage().window().maximize();
	}

}
