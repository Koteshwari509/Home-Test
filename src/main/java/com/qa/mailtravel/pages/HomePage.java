package com.qa.mailtravel.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.mailtravel.util.AppConstants;
import com.qa.mailtravel.util.ElementUtil;
import com.qa.mailtravel.util.TimeUtil;

public class HomePage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	private By specialoffers = By.linkText("Special Offers");
	private By search = By.name("searchtext");
	private By searchForLocation = By.partialLinkText("11 days from");

	private By searchIcon = By.cssSelector("div#freetext_search_form button");

	public HomePage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	public String HomePageTitle() {
		return eleUtil.waitForTitleIs(AppConstants.HOME_PAGE_TITLE, TimeUtil.DEFAULT_TIME_OUT);

	}

	public boolean isSpecialOffersExist() {
		return eleUtil.doIsDisplayed(specialoffers);
	}

	public boolean isSearchExist() {
		return eleUtil.doIsDisplayed(search);
	}

	public ResultsPage performSearch(String countryName) {
		System.out.println("country search for :" + countryName);
		if (isSearchExist()) {
eleUtil.doSendKeys(search, countryName);
						
			
			eleUtil.clickElementWhenReady(searchForLocation, 20);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			return new ResultsPage(driver);
		}
		return null;
	}
}
