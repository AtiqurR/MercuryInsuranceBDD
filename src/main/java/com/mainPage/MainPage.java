package com.mainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mercury.qa.common.CommonMethods;

public class MainPage{
	
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Insurance']") public WebElement insurance;
	@FindBy(xpath = "(//a[text()='Auto Insurance'])[1]") public WebElement autoInsurance;
	@FindBy(name = "gaqZipCode") public WebElement zipCode;
	@FindBy(id = "submit-gaq") public WebElement getQuote;
	
	public void insuranceStep(WebDriver driver, CommonMethods cMethods) {
		cMethods.hoverOver(driver, insurance);
	}
	
	public void autoInsuranceStep(CommonMethods cMethods) {
	cMethods.clickMethod(autoInsurance);	
	}
	
	public void zipCodeStep(CommonMethods cMethods,String value) {
		cMethods.writeText(zipCode, value);
	}
	public void getQuoteStep(CommonMethods cMethods) {
		cMethods.clickMethod(getQuote);
	}
}
