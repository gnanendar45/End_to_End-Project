package com.TestRunnaerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = {"com/StepDefination"},dryRun = false,
                  plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags= "@tc005")
                    //plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})
		
public class TestRunners_Amezon {

}
