package com.qa.mailtravel.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.mailtravel.Base.BaseTest;

public class ResultsPageTest extends BaseTest {

	@BeforeClass
	public void CountryInfoSetUp() {
		rp=hp.performSearch("India");
	}

	 @Test(priority=4)
	 public void pageTitleTest() {
		 String actTitle = rp.getSearchPagetitle();
			System.out.println("Results page title is:" + actTitle);
			Assert.assertEquals(actTitle, "India | Mail Travel");		 
	 }
@Test(priority=5)
public void BookOnlineTest()
{
	tp=rp.BookOnline();
	
}
}