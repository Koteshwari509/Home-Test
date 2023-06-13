package com.qa.mailtravel.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.mailtravel.util.AppConstants;
import com.qa.mailtravel.util.ElementUtil;
import com.qa.mailtravel.util.TimeUtil;

public class ResultsPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	private By calendardate= By.xpath("//*[@id=\"nbf_tpl_pms_calendar-f0050aa159413059b0d39248658bdb50\"]/div[2]/div/div[2]/label/div/div[2]/span");
	private By NumOfPassengers = By.xpath("//*[@id='numAdults-f0050aa159413059b0d39248658bdb50']");
	private By selectprice = By.cssSelector("#tour-price > span");
	private By bookonline = By.id("book-button");
	private By nextMonth = By.xpath("//*[@id='nbf_tpl_pms_calendar-f0050aa159413059b0d39248658bdb50']/div[1]/div[3]");

	public ResultsPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	public String getSearchPagetitle() {

		return eleUtil.waitForTitleIs(AppConstants.RESULTS_PAGE_TITLE, TimeUtil.DEFAULT_TIME_OUT);
	}

	public TravelInfoPage BookOnline() {

		eleUtil.doClick(nextMonth);
		eleUtil.doClick(calendardate);
		eleUtil.doSelectDropDownByIndex(NumOfPassengers, 1);
		if (NumOfPassengers.equals(selectprice)) {
			System.out.println("price for 2 adults is ..:" + selectprice);

		} else {
			System.out.println("validate the price for 2 adults");

		}
		eleUtil.doClick(bookonline);

		return new TravelInfoPage(driver);

	
	}
}

