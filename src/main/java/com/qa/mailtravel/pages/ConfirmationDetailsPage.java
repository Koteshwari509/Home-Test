package com.qa.mailtravel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.mailtravel.util.AppConstants;
import com.qa.mailtravel.util.ElementUtil;
import com.qa.mailtravel.util.TimeUtil;

public class ConfirmationDetailsPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	private By booknow = By.cssSelector("#nbf_booknow_button");
	private By headertext = By.xpath("//*[@id=\"nbf_container\"]/div[1]/h1[2]");

	public ConfirmationDetailsPage(WebDriver driver) {
		this.driver = driver;

		eleUtil = new ElementUtil(driver);
	}

	public String confirmationPageTitle() {
		return eleUtil.waitForTitleIs(AppConstants.CONFIRMATION_PAGE_TITLE, TimeUtil.DEFAULT_TIME_OUT);
	}

	public boolean isBookNowExist() {
		return driver.findElement(booknow).isEnabled();
	}

	public boolean headerDisplayed() {
		return eleUtil.doIsDisplayed(headertext);

	}
	public VerificationPage doClickBookNow()
{
		 eleUtil.doClick(booknow);
		 return new VerificationPage(driver);
	}
}