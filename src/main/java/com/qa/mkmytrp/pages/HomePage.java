package com.qa.mkmytrp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mkmytrp.base.TestBase;
import com.qa.mkmytrp.utility.UtiliClass;

public class HomePage extends TestBase {

	public HomePage(WebDriver rdriver) {

		driver = rdriver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='fromCity']")
	WebElement fromCity;
	@FindBy(xpath = "//div[@class='react-autosuggest__section-container react-autosuggest__section-container--first']/child::ul/li[8]")
	WebElement chennai;
	@FindBy(xpath = "//div[@class='react-autosuggest__section-container react-autosuggest__section-container--first']/child::ul/li[1]")
	WebElement mumbai;
	@FindBy(xpath = "//label[@for='departure']")
	WebElement depatuer;
	@FindBy(xpath = "//span[@aria-label='Next Month']")
	WebElement next;
	@FindBy(xpath = "//div[@aria-label='Tue Nov 01 2022']")
	WebElement date;

	@FindBy(xpath = "//span[@class='langCardClose']")
	WebElement closed;

	@FindBy(xpath = "//a[normalize-space()='Search']")
	WebElement search;

	public SearchPage travelldata() throws InterruptedException {
		fromCity.click();
		chennai.click();
		mumbai.click();
		closed.click();
		// depatuer.click();
		UtiliClass.waituntil(driver, date);

		search.click();
		return new SearchPage();

	}

}
