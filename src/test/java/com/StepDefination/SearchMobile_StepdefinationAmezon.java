package com.StepDefination;

import java.io.IOException;

import com.BaseClass.Librarys;
import com.Pages.Search_AmezonPage;
import com.ReusableFunctions.SeleniumReusables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMobile_StepdefinationAmezon extends Librarys{

	SeleniumReusables se;
	Search_AmezonPage sa;
	
	@Given("Launch the Amezon Application")
	public void launch_the_amezon_application() throws IOException {
		se=new SeleniumReusables(driver);
		sa=new Search_AmezonPage();
		launchApplication();
	}
	@Then("It should Navigate to the Home pages")
	public void it_should_navigate_to_the_home_pages() {
	   sa.Homescreen();
	}
	@Given("User enter the text in the search fields")
	public void user_enter_the_text_in_the_search_fields() {
		 sa.Search("Mobile");
	}
	@When("Click the search button")
	public void click_the_search_button() throws InterruptedException {
		Thread.sleep(2000);
		 sa.Search("Mobile");
	   sa.Clicksaerch();
	}
	@Then("It should navigate to the search result page and display the relavent detailss")
	public void it_should_navigate_to_the_search_result_page_and_display_the_relavent_detailss() {
		sa.Printentireresult();
	}
	@Then("Select the Brands")
	public void select_the_brands() {
	   
	}
	@Then("select the Cellular Technology")
	public void select_the_cellular_technology() {
	    
	}
	@Then("select the Display type")
	public void select_the_display_type() {
	    
	}
	
}
