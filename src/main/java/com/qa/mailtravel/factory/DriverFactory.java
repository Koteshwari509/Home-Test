package com.qa.mailtravel.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	public WebDriver driver; // This driver will supply driver to everyone

public WebDriver initDriver(String browserName) {
	System.out.println("Browser name is :"+ browserName);
	if(browserName.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		
	}
	
	else if(browserName.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
		
	}

	else if(browserName.equalsIgnoreCase("safari")) {
		driver = new SafariDriver();
		
	}
	else {
		System.out.println("Please pass the right browser name..."+browserName);
	}
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.get("https://www.mailtravel.co.uk/");
return driver;
}





}
