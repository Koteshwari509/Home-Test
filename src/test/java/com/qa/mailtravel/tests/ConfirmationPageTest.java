package com.qa.mailtravel.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.mailtravel.Base.BaseTest;

public class ConfirmationPageTest extends BaseTest{
	@Test(priority = 10)
	public void headerDisplayTest() {
		Assert.assertTrue(cp.headerDisplayed());
	}

	@Test(priority = 11)
	public void confirmationPageTitleTest() {
		Assert.assertEquals(cp.confirmationPageTitle(),"Payment Details");
	}
	

	
	@Test(priority = 12)
	public void bookNowdispalyedTest() {
		Assert.assertTrue(cp.isBookNowExist());
	}

	@Test(priority = 13)
	public void bookNowTest() {
		vp=cp.doClickBookNow();
	}
	

}
