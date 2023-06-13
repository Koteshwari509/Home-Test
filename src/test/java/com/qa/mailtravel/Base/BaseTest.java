package com.qa.mailtravel.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.mailtravel.factory.DriverFactory;
import com.qa.mailtravel.pages.ConfirmationDetailsPage;
import com.qa.mailtravel.pages.HomePage;
import com.qa.mailtravel.pages.PassengerDetailsForm;
import com.qa.mailtravel.pages.ResultsPage;
import com.qa.mailtravel.pages.TravelInfoPage;
import com.qa.mailtravel.pages.VerificationPage;

public class BaseTest {

	DriverFactory df;  // Creating an object of DriverFactory to call the initDriver method
	WebDriver driver;
	protected HomePage hp;
	protected ResultsPage rp;
	protected TravelInfoPage tp;
	protected PassengerDetailsForm pd;
	protected VerificationPage vp;
	protected ConfirmationDetailsPage cp;
	@BeforeTest
	public void setup() {
		
		df= new DriverFactory();
	   driver=	df.initDriver("chrome"); //storing the webdriver in the driver reference variable 
		hp= new HomePage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	}
	
	
	
	

