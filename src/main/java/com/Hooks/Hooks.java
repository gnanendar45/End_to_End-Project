package com.Hooks;

import java.io.IOException;

import com.BaseClass.Librarys;
import com.ReusableFunctions.SeleniumReusables;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


	public class Hooks extends Librarys {
		SeleniumReusables se;
		public static Scenario scenario;
		@Before
		public void test(Scenario Cucumberscenario) throws IOException {
			
			scenario=Cucumberscenario;
			launchApplication();
		}
		
		@After
		public void cleanup(Scenario scenario) {
	    se=new SeleniumReusables(driver);
	    se.attachscreenshot(scenario);
	    
	    se.closeapp();
		}
}

