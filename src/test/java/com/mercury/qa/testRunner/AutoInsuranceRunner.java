package com.mercury.qa.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "Features",
                                glue = "com.mercury.qa.steps",
                                monochrome =true,
                                dryRun = false,
                                plugin = {"pretty", "html:src/target/htmlReport.html"})

public class AutoInsuranceRunner {

}
