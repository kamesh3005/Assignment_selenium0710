package com.qa.mkmytrp.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.mkmytrp.base.TestBase;

public class UtiliClass extends TestBase {

	public void selectDate(WebDriver driver, WebElement ele, String dateval) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + dateval + " ');", ele);
	}

	public static void waituntil(WebDriver driver, WebElement ele) {

		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.elementToBeClickable(ele)).click();

	}

}
