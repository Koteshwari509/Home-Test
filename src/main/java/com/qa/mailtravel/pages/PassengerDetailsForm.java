package com.qa.mailtravel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.mailtravel.util.AppConstants;
import com.qa.mailtravel.util.ElementUtil;
import com.qa.mailtravel.util.TimeUtil;

public class PassengerDetailsForm {

	private WebDriver driver;
	private ElementUtil eleUtil;
	private By title = By.cssSelector("#pax-a-title-1");
	private By firstname = By.cssSelector("#pax-a-first-1");
	private By lastname = By.cssSelector("#pax-a-last-1");
	private By dateOfBirthDay = By.xpath("//*[@id=\"pax-a-dobd-1\"]");
	private By dateofBirthMonth = By.xpath("//*[@id=\"pax-a-dobm-1\"]");
	private By dateOfBirthYear = By.xpath("//*[@id=\"pax-a-doby-1\"]");

	private By SecondTitle = By.cssSelector("#pax-a-title-2");
	private By secondadultfirstname = By.cssSelector("#pax-a-first-2");
	private By secondadultlastname = By.cssSelector("#pax-a-last-2");
	private By day = By.xpath("//*[@id=\"pax-a-dobd-2\"]");
	private By month = By.xpath("//*[@id=\"pax-a-dobm-2\"]");
	private By year = By.xpath("//*[@id=\"pax-a-doby-2\"]");

	private By mobileNumber = By.cssSelector("#contact-mobile");
	private By emailAdd = By.cssSelector("#contact-email");
	private By addressLine1 = By.cssSelector("#contact-address1");
	private By addressLine2 = By.cssSelector("#contact-address2");
	private By city = By.cssSelector("#contact-city");
	private By postcode = By.cssSelector("#contact-postcode");
	private By country = By.cssSelector("#contact-country");
	private By hearabout = By.cssSelector("#contact-hearabout");
	private By button = By.xpath("//*[@id='paxform-select']/button");

	public PassengerDetailsForm(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	public String PassengerPageTitle() {
		return eleUtil.waitForTitleIs(AppConstants.PASSENGER_PAGE_TLTLE, TimeUtil.DEFAULT_TIME_OUT);
	}

	public ConfirmationDetailsPage passengerDetails() {
		eleUtil.doSelectDropDownByVisibleText(title, "Mrs");
		eleUtil.doSendKeys(firstname, "Koteshwari");
		eleUtil.doSendKeys(lastname, "Pingili");
		eleUtil.doSelectDropDownByIndex(dateOfBirthDay, 5);
		eleUtil.doSelectDropDownByVisibleText(dateofBirthMonth, "May");
		eleUtil.doSelectDropDownByIndex(dateOfBirthYear, 10);

		eleUtil.doSelectDropDownByVisibleText(SecondTitle, "Mr");
		eleUtil.doSendKeys(secondadultfirstname, "Ram");
		eleUtil.doSendKeys(secondadultlastname, "Ping");
		eleUtil.doSelectDropDownByIndex(day, 5);
		eleUtil.doSelectDropDownByVisibleText(month, "June");
		eleUtil.doSelectDropDownByIndex(year, 12);
		eleUtil.doSendKeys(mobileNumber, "1234450095");
		eleUtil.doSendKeys(emailAdd, "kotee.pingili@gmail.com");
		eleUtil.doSendKeys(addressLine1, "84,Wolseystreet");
		eleUtil.doSendKeys(city, "Ipswich");
		eleUtil.doSendKeys(postcode, "IP1 1AF");
		eleUtil.doSelectDropDownByVisibleText(country, "United Kingdom");
		eleUtil.doSelectDropDownByVisibleText(hearabout, "Email");

		eleUtil.doClick(button);
		return new ConfirmationDetailsPage(driver);
	}
}