package com.qa.mailtravel.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.mailtravel.util.ElementUtil;

public class VerificationPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By header= By.xpath("//*[@id=\"nbf_container\"]/div[1]/h1[2]");
	private By bookNow= By.cssSelector("#nbf_booknow_button > div");
   
    public VerificationPage(WebDriver driver) {
		
		this.driver=driver;
		eleUtil = new ElementUtil(driver);
	}

	public boolean headerDisplay()
	{
		return driver.findElement(header).isDisplayed();
		
	}
	
	public boolean bookNowDisplayed()
	{
		return driver.findElement(bookNow).isEnabled();
	}


}
