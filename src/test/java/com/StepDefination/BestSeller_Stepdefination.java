package com.StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.Librarys;
import com.Pages.BestSeller_AmezonPage;
import com.ReusableFunctions.SeleniumReusables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BestSeller_Stepdefination extends Librarys {

	BestSeller_AmezonPage bp;
	SeleniumReusables se;

    @Given("User to move to click the Best Seller link")
    public void user_to_move_to_click_the_best_seller_link() {
       
    	bp=new BestSeller_AmezonPage();
		se=new SeleniumReusables(driver);
		bp.ClickonBestsellerlink();
    }

    @Given("User to move to Electronics link")
    public void user_to_move_to_electronics_link() {
        bp.ClickonElectronicslink();
    }

    @When("User should click on Computer&Accessories link")
    public void user_should_click_on_computer_accessories_link() {
       bp.ClickonComputeraccessorieslink();
    }

    @When("It should display the Bestsellers in computers&Accessories and get title and prices")
    public void it_should_display_the_bestsellers_in_computers_accessories_and_get_title_and_prices() {
    	System.out.println("Bestsellers in Computers & Accessories");
        List<WebElement> element= driver.findElements(By.xpath("//div[@id='gridItemRoot']"));
        se.MultipleGettext(element);
    }

    @When("User should click on Audio and video accseeories link")
    public void user_should_click_on_audio_and_video_accseeories_link() {

    	bp.ClickonAudiovideoaccessorieslink();
    }

    @When("It should display the Bestsellers in webcam&voip Equipment and get title and prices")
    public void it_should_display_the_bestsellers_in_webcam_voip_equipment_and_get_title_and_prices() {
    	System.out.println("Bestsellers in Webcams & VoIP Equipment");
        List<WebElement> element=driver.findElements(By.xpath("//div[@id=\"gridItemRoot\"]"));
        se.MultipleGettext(element);
    }

    @Then("User should click on the Hikvision 4th link")
    public void user_should_click_on_the_hikvision_4th_link() {
       bp.Clickon4thlinkHikvision();
    }

	
}
