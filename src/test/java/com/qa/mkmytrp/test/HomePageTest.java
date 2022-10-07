package com.qa.mkmytrp.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mkmytrp.base.TestBase;
import com.qa.mkmytrp.pages.HomePage;

import com.qa.mkmytrp.pages.SearchPage;

public class HomePageTest extends TestBase {
	HomePage homepage;
	SearchPage searchpage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod

	public void setup() {

		initialization();
		homepage = new HomePage(driver);

	}

	@Test

	public void homepagetestmethod() throws InterruptedException {
		searchpage = homepage.travelldata();

	}

	@AfterMethod

	void tearDown() {

		// driver.quit();
	}

}