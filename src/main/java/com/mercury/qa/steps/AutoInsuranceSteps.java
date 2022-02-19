package com.mercury.qa.steps;

import com.mainPage.MainPage;
import com.mercury.qa.common.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoInsuranceSteps  {
	
	MainPage mainPage = new MainPage(BaseClass.driver);
	CommonMethods cMethods= new CommonMethods();
	
	@Given("user should be on the mercury auto insurance home page")
	public void user_should_be_on_the_mercury_auto_insurance_home_page() {
		
	}

	@When("user  move cursor onto auto insurance tab")
	public void user_move_cursor_onto_auto_insurance_tab() {
		mainPage.insuranceStep(BaseClass.driver, cMethods);
	}
	
	@And("user should click auto insurance button")
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
