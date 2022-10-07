package com.qa.mkmytrp.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mkmytrp.base.TestBase;
import com.qa.mkmytrp.pages.BookNowPage;
import com.qa.mkmytrp.pages.HomePage;
import com.qa.mkmytrp.pages.SearchPage;

public class SearchPageTest extends TestBase {

	HomePage homepage;
	SearchPage searchpage;
	BookNowPage booknowpage;

	public SearchPageTest() {

		super();
	}

	@BeforeMethod

	public void setup() throws InterruptedException {

		initialization();
		homepage = new HomePage(driver);
		booknowpage = new BookNowPage();

		searchpage = homepage.travelldata();

	}

	@Test(priority = 1)

	public void filghInformation() {

		searchpage.amountDetials();

	}

	@Test(priority = 2)

	public void flightPriceInfo() {
		searchpage.flightprice();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
