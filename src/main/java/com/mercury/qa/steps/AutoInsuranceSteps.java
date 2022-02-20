package com.mercury.qa.steps;


import org.junit.Assert;
import com.mainPage.MainPage;
import com.mercury.qa.common.CommonMethods;
import com.mercury.qa.utilities.Java_Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoInsuranceSteps  {
	
	MainPage mainPage = new MainPage(BaseClass.driver);
	CommonMethods cMethods= new CommonMethods();
	
	@Given("user should be on the mercury auto insurance home page {string}")
	public void user_should_be_on_the_mercury_auto_insurance_home_page(String val) {
		String title =BaseClass.driver.getTitle();
		Java_Logger.log("Title: "+ title);
        Assert.assertEquals(val, title);
	}

	@When("user  move cursor onto auto insurance tab")
	public void user_move_cursor_onto_auto_insurance_tab() {
		mainPage.insuranceStep(BaseClass.driver, cMethods);
	}
	
	@When("user should click auto insurance button")
	public void user_should_click_auto_insurance_button() {
		mainPage.autoInsuranceStep(cMethods);
	}
	
	@When("user  put their zipcode")
	public void user_put_their_zipcode() {
		mainPage.zipCodeStep(cMethods, "10472");
	}
	
	@Then("user should click onto get a quote button")
	public void user_should_click_onto_get_a_quote_button() {
		mainPage.getQuoteStep(cMethods);
	}
}
