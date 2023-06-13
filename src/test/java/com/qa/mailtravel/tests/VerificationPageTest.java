package com.qa.mailtravel.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.mailtravel.Base.BaseTest;

public class VerificationPageTest extends BaseTest {

	@Test(priority = 14)
	public void headerDisplayTest() {
		Assert.assertTrue(vp.headerDisplay());
	}

	@Test(priority = 15)
	public void bookNowdispalyedTest() {
		Assert.assertTrue(vp.bookNowDisplayed());
	}

	
}
