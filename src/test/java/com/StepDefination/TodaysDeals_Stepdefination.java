package com.StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.BaseClass.Librarys;
import com.Pages.TodaysDeals_AmezonPage;
import com.ReusableFunctions.SeleniumReusables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TodaysDeals_Stepdefination extends Librarys{
	
	 TodaysDeals_AmezonPage tp;
	  SeleniumReusables se;
	 
	 @Given("User should click on the Today's Deals link")
	    public void user_should_click_on_the_todays_deals_link() throws InterruptedException {
	     se=new SeleniumReusables(driver);
	      tp=new TodaysDeals_AmezonPage();
	      Thread.sleep(2000);
	      tp.ClickonTodayslink();
	    }

	    @Given("User click on the Prime Programs under the Prime Exclusives check box")
	    public void user_click_on_the_prime_programs_under_the_prime_exclusives_check_box() throws InterruptedException {
	    	System.out.println("Click on check box");
	    	Thread.sleep(2000);
	      tp.Clickoncheckbox();
	    }

	    @When("It Should display the prime exclusives and get title and prices")
	    public void it_should_display_the_prime_exclusives_and_get_title_and_prices() {
	    	System.out.println("Prime Exclusives prices");
	      List<WebElement> element=driver.findElements(By.xpath("//*[@id='DealsGridScrollAnchor']/div[3]/div/div/div[2]/div/div/div/div"));
	      se.MultipleGettext(element);
	    }  
	    
	   
	    @Then("User click on the Electronics link")
	    public void user_click_on_the_electronics_link() throws InterruptedException {
	    	Thread.sleep(2000);
	       tp.Clickonelectronics();
	       System.out.println("Electronics all details");
	       List<WebElement> element=driver.findElements(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div/div/div/div"));
	       se.MultipleGettext(element);
	    }
	    
	    @Then("User click on the Amezon device & Accessories departments and it should be display gettitle and price")
	    public void user_click_on_the_amezon_device_accessories_departments_and_it_should_be_display_gettitle_and_price() throws InterruptedException {
	    	Thread.sleep(2000);
	        tp.ClickAmazonDevicecheckbox();
	        System.out.println("All details onAmezon device & Accessories");
	        List<WebElement> element=driver.findElements(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div/div/div/div"));
	        se.MultipleGettext(element);
	    }

	    @Then("User click on the amazonbasics brands and it should be display gettitle and price")
	    public void user_click_on_the_amazonbasics_brands_and_it_should_be_display_gettitle_and_price() throws InterruptedException {
	    	Thread.sleep(2000);
	        tp.ClickAmazonbaicscheckbox();
	        System.out.println("Entaire all details on amazonbasics");
	        List<WebElement> element=driver.findElements(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div/div/div/div"));
	        se.MultipleGettext(element);
	    }

	    @Then("User click on the {int}%ofmore checkbox prics and it should be display gettitle and price")
	    public void user_click_on_the_ofmore_checkbox_prics_and_it_should_be_display_gettitle_and_price(Integer int1) {
	       tp.ClickFilterpricescheckbox();
	       System.out.println("enter the price details");
	       List<WebElement> element=driver.findElements(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div/div/div/div"));
	       se.MultipleGettext(element);
	    }
	    
	    @Then("User click on Mobile link and click on the first mobilelink")
	    public void user_click_on_mobile_link_and_click_on_the_first_mobilelink() {
	    	tp.Clickonmobilelink();
	    }

}
