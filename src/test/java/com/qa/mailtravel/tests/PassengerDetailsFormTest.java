package com.qa.mailtravel.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.mailtravel.Base.BaseTest;

public class PassengerDetailsFormTest extends BaseTest {

	@Test(priority=8)
	public void passengerPageTitleTest() {
		String Title=pd.PassengerPageTitle();
		System.out.println(" Passenger page title is ..:"+ Title);
		Assert.assertEquals(Title, "Now Booking India | Mail Travel");		 

	}
	@Test(priority=9)
	public void PassengerDetailsTest() {
		pd.passengerDetails();
	}
}
