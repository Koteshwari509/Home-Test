package com.qa.mailtravel.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.mailtravel.util.AppConstants;
import com.qa.mailtravel.util.ElementUtil;
import com.qa.mailtravel.util.TimeUtil;

public class TravelInfoPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	private By numberReq = By.cssSelector("#room-1673582-numselect");
	private By selectrooms= By.xpath("//*[@id='accomForm-select']/button/div[5]/div");

	public TravelInfoPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);

	}

	public String travelPageTitle() {
		return eleUtil.waitForTitleIs(AppConstants.TRAVEL_PAGE_TITLE, TimeUtil.DEFAULT_TIME_OUT);
	}

	public PassengerDetailsForm AccomdationDetails() {
		eleUtil.doSelectDropDownByIndex(numberReq, 1);
		eleUtil.doClick(selectrooms);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return new PassengerDetailsForm(driver);
//return null;
}

}
