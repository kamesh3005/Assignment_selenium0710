package com.qa.mkmytrp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mkmytrp.base.TestBase;

public class SearchPage extends TestBase {

	public SearchPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='OKAY, GOT IT!']")
	WebElement okgoIt;

	@FindBy(xpath = "(//button[@class='ViewFareBtn  text-uppercase ']//child::span[text()='View Prices'])[1]")
	WebElement viewPriceDetials;

	@FindBy(xpath = "(//div[@class='viewFareRow '])[1]")
	WebElement amoutinfo;

	@FindBy(xpath = "//span[contains(text(),'Duration')]")
	WebElement duraition;

	@FindBy(xpath = "(//span[text()='View Flight Details'])[1]")
	WebElement flightDetials;

	@FindBy(xpath = "//div[@class='flightDetailsRow']")
	WebElement flightInfo;

	public BookNowPage amountDetials() {

		okgoIt.click();
		viewPriceDetials.click();
		String text = amoutinfo.getText();
		System.out.println("The Second Lowest filght price is :" + text);

		return new BookNowPage();
	}

	public BookNowPage flightprice() {
		okgoIt.click();
		duraition.click();
		flightDetials.click();
		String text = flightInfo.getText();
		System.out.println("The information of the flight :" + text);

		return new BookNowPage();

	}

}
