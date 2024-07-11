package com.StepDefination;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.Librarys;
import com.Pages.Fassion_AmezonPage;
import com.ReusableFunctions.SeleniumReusables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fassion_Stepdefination extends Librarys{

	Fassion_AmezonPage fp=new Fassion_AmezonPage(driver);
	SeleniumReusables se=new SeleniumReusables(driver);
	
	@Given("User should click on the Fashion link")
	public void user_should_click_on_the_fashion_link() {
	    fp.ClickonFashionlink();
	}

	@Given("User mouise over the Women link and click on the Handlooms&Handicrafts link")
	public void user_mouise_over_the_women_link_and_click_on_the_handlooms_handicrafts_link() throws InterruptedException {
	  /*  fp.Movetowomenslink();
	    Thread.sleep(2000);
	    fp.Clickonhanloomlink(); */
		try {
	        fp.Movetowomenslink();
	        Thread.sleep(2000);
	        fp.Clickonhanloomlink();
	    } catch (NoSuchElementException e) {
	        System.err.println("Element not found: " + e.getMessage());
	        // Optional: Take corrective actions (e.g., retry, log the error)
	    }
	}

	@When("User should click on the Home&Kitchen link and get title the under Categorys")
	public void user_should_click_on_the_home_kitchen_link_and_get_title_the_under_categorys() {
	    fp.ClickonHomekitchenlink();
	    List<WebElement> element=driver.findElements(By.xpath("//a[@class=\"a-color-base a-link-normal\"]"));
	    System.out.println("enter the Categorys Home&Kitchen");
	    se.MultipleGettext(element);
	}

	@When("User should click the checkbox in getitbytomorrow check box")
	public void user_should_click_the_checkbox_in_getitbytomorrow_check_box() {
		System.out.println("Enter the click the checkbox in get it by tomorrow");
	    fp.ClickGetitbytomarowcheckbox();
	}

	 @When("It should be get title and prices")
	 public void it_should_be_get_title_and_prices() {
		 List<WebElement> element=driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div"));
		 se.MultipleGettext(element);
		 System.out.println("entair results");
	 }
	 @When("User shold move to Furniture link and click on Sofa beds link and It should get title and prices")
	 public void user_shold_move_to_furniture_link_and_click_on_sofa_beds_link_and_it_should_get_title_and_prices() throws InterruptedException {
		 fp.ClickonFurnaturelink();
		 fp.MoveonSofabedslink();
		 Thread.sleep(2000);
		 List<WebElement> element=driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div"));
		 se.MultipleGettext(element);
		 System.out.println("Sofabeds prices");
	 }
	   
	 @Then("User check on the checkbox in Sofasize in threeSeats and click on fourth sofa gettitle and click and click on new window click on Buynow link")
	 public void user_check_on_the_checkbox_in_sofasize_in_threeseats_and_click_on_fourth_sofa_gettitle_and_click_and_click_on_new_window_click_on_buynow_link() throws InterruptedException {
		 fp.ClickThreeseatscheckbox();
		 fp.ClickFourthIteam();
		 Thread.sleep(2000);
		 fp.ClickBuynoelink();
		 
	 }
	
}
