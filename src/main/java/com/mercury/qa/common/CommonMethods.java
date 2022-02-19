package com.mercury.qa.common;

import java.util.NoSuchElementException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.mercury.qa.steps.BaseClass;
import com.mercury.qa.utilities.Java_Logger;

public class CommonMethods {

	public void hoverOver(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		try {
			actions.moveToElement(element).build().perform();
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public String getText(WebDriver driver, String expected, WebElement element) {
		String title = null;
		try {
			BaseClass.wait.until(ExpectedConditions.visibilityOf(element));
			Java_Logger.log("Actual value:"+ title);
			Assert.assertEquals(expected, title);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Assert.fail();
		}
		return title;
	}

	public void isElementDisplayed(WebElement element) {
		element.isDisplayed();
	}

	public void clickMethod(WebElement element) {
		element.click();
	}
	
	public void writeText(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	
}
