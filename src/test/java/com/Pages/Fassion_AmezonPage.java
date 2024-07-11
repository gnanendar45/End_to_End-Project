package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Librarys;
import com.ReusableFunctions.SeleniumReusables;

public class Fassion_AmezonPage extends Librarys{

	SeleniumReusables se=new SeleniumReusables(driver);
	public Fassion_AmezonPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Fashion']")
	WebElement Fassioonlink;
	@FindBy(xpath="//*[@id='nav-subnav']/a[2]/span[1]")
	WebElement Womenlink;
	@FindBy(xpath="//*[text()='HANDLOOMS & HANDICRAFTS']")
	WebElement Handloomslink;
	@FindBy(xpath="//span[text()='Home & Kitchen']")
	WebElement HomeKItchenlink;
	@FindBy(xpath="//*[@id='p_90/6741118031']/span/a/div")
	WebElement Getitbytomarowcheckbox;
	@FindBy(xpath="//*[@id=\"anonCarousel1\"]/ol/li[1]/span/div")
	WebElement mobilelink;
	@FindBy(xpath="//*[@id=\"mbb-offeringID-1\"]")
	WebElement Checkbox;
	@FindBy(xpath="//*[@id=\"buy-now-button\"]")
	WebElement ClickBuynow;
	
	@FindBy(xpath="//*[@id=\"nav-subnav\"]/a[5]/span[1]")
	WebElement Furniturelink;
	@FindBy(xpath="//*[@id=\"nav-flyout-aj:https://m.media-amazon.com/images/G/31/img16/furniture/megamenu/subnavjan18.json:subnav-sl-megamenu-4:0\"]/div[2]/div/div[1]/ul/li[1]/a")
	WebElement Sofabedslink;
	@FindBy(xpath="//*[@id=\"p_n_feature_three_browse-bin/5785291031\"]/span/a/div")
	WebElement Threeseatschekbox;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div")
	WebElement FourthIteam;
	@FindBy(xpath="//*[@id=\"buy-now-button\"]")
	WebElement ClickonBuynowlink;
	
	
	public void ClickonFashionlink() {
		se.click(Fassioonlink);
	}
	public void Movetowomenslink() throws InterruptedException {
		se.moucehover(Womenlink);
	}
	public void Clickonhanloomlink() {
		se.click(Handloomslink);
	}
	public void ClickonHomekitchenlink() {
		se.click(HomeKItchenlink);
	}
	public void ClickGetitbytomarowcheckbox() {
		se.click(Getitbytomarowcheckbox);
	}
	public void ClickonMobile() {
		se.Scrolldown(mobilelink);
		se.click(mobilelink);
	}
	public void ClickCheckbox() {
		se.click(Checkbox);
	}
	public void ClickBuynoelink() {
		se.click(ClickBuynow);
	}
	
	public void ClickonFurnaturelink() throws InterruptedException {
		se.moucehover(Furniturelink);
	}
	public void MoveonSofabedslink() throws InterruptedException {
		se.moucehover(Sofabedslink);
	}
	public void ClickThreeseatscheckbox() {
		se.click(Threeseatschekbox);
	}
	public void ClickFourthIteam() {
		se.click(FourthIteam);
	}
	public void ClickonBuynow() throws InterruptedException {
		se.windowhandlink(ClickonBuynowlink);
		se.click(ClickonBuynowlink);
	}
}
