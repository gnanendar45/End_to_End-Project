package com.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BaseClass.Librarys;
import com.ReusableFunctions.SeleniumReusables;

public class Search_AmezonPage extends Librarys{
	
	SeleniumReusables se;
	
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	WebElement searchtext;
	
	@FindBy(xpath="//div[@id='nav-cover']")
	WebElement homepage;
	
	@FindBy(xpath="//div[@id='search']")
	WebElement searchresults;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']/div/..")
	List<WebElement> entairresults;
	
	@FindBy(xpath="//div[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div")
	WebElement thitdresult;
	
	public void Search(String Text) {
		se=new SeleniumReusables(driver);
		se.EnterValue(searchtext, Text);
	}
	
	public void Clicksaerch() {
		searchtext.sendKeys(Keys.ENTER);
	}
	
	public void Homescreen() {
		System.out.println("Homepage displayed");
	}
	
	public void Result() {
		System.out.println(searchresults.isDisplayed());
		System.out.println(driver.getTitle());
	}
	
	public void Printentireresult() {
		se.MultipleGettext(entairresults);
	}
	
	public void Print3rdresult() {
		se.Getvalue(thitdresult);
	}

}
