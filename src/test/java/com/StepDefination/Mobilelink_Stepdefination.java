package com.StepDefination;

import java.util.List;

import javax.management.loading.MLet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.Librarys;
import com.Pages.Mobilelink_AmezonPage;

import com.ReusableFunctions.SeleniumReusables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mobilelink_Stepdefination extends Librarys {


	Mobilelink_AmezonPage ml;
	SeleniumReusables se;
   
	
	@Given("User to move to click on the Mobiles link")
	public void user_to_move_to_click_on_the_mobiles_link() {
		 se=new SeleniumReusables(driver);
			ml=new Mobilelink_AmezonPage(driver);
		ml.Clickmobilelink();
	}
	@When("User curser to move to the Tv&Home entertinements")
	public void user_curser_to_move_to_the_tv_home_entertinements() throws InterruptedException {
	   ml.Clicktvhome();
	}
	@When("Move to LG and click")
	public void move_to_lg_and_click() {
	   ml.ClickLglink();
	}
	@Then("User click an Elgible for pay on delivery checkbox")
	public void user_click_an_elgible_for_pay_on_delivery_checkbox() {
	   ml.Clickcheckbox();
	}
	
	//User click an Elgible for pay on delivery checkbox
	@Then("It should display the search result and get the title and prices")
	public void it_should_display_the_search_result_and_get_the_title_and_prices() {
		
	    List<WebElement> elements = driver.findElements(By.xpath(" //*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div"));
	    se.MultipleGettext(elements);
	}
	
	
}
