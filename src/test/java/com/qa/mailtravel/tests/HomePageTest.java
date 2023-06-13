package com.qa.mailtravel.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.mailtravel.Base.BaseTest;

public class HomePageTest extends BaseTest {

	@Test(priority = 1)
	public void homepageTitleTest() {
		String actTitle = hp.HomePageTitle();
		System.out.println("Login page title:" + actTitle);
		Assert.assertEquals(actTitle, "Home Page | Mail Travel");

	}

	@Test(priority = 2)
	public void searchExistTest() {

		Assert.assertTrue(hp.isSearchExist());
	}

	@Test(priority = 3)
	public void countrySearchTest() {

		String countryName = "India";
		rp = hp.performSearch(countryName);
		String actTitle = rp.getSearchPagetitle();
		System.out.println("searchresults page title is..:" + actTitle);
	}
}