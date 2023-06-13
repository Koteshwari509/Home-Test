package com.qa.mailtravel.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.mailtravel.Base.BaseTest;

public class TravelInfoPageTest extends BaseTest {
	
	@Test(priority=6)
	public void travelPageTitleTest()
	
	{
	String actTitle=tp.travelPageTitle();
	System.out.println("Travelinfo page title is:"+actTitle);
	Assert.assertEquals(actTitle, "New Booking India | Mail Travel");

		
	}
	@Test(priority=7)
	public void AccomdationDetailsTest() {
		pd=tp.AccomdationDetails();
		
	}
	

	
	
}
