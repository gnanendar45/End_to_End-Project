package com.TestRunnaer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = {"com/StepDefination"},
                  plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags= "@tc005")
                 //  plugin = {"json:target/cucumber.json"},tags = "@tc005", monochrome = true)
		
public class Runners_Amezon {

}
