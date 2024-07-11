package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Librarys;
import com.ReusableFunctions.SeleniumReusables;

public class TodaysDeals_AmezonPage extends Librarys{
	SeleniumReusables se;
	
	public TodaysDeals_AmezonPage() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[6]")
	WebElement Todaysealslink;
	@FindBy(xpath="//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[5]/div/span/div/label/i")
	WebElement Primeexclusivecheckbox;
	@FindBy(xpath="//*[@id=\"anonCarousel1\"]/ol/li[5]/button")
	WebElement Electronicslink;
	@FindBy(xpath="//*[text()='Amazon Devices & Accessories']/../../input")
	WebElement AmazonDevicecheckbox;
	@FindBy(xpath="//*[text()='amazonbasics']/../../input")
	WebElement Amazonbaicscheckbox;
	@FindBy(xpath="//*[text()='₹1,000 to ₹2,000']/../../input")
	WebElement Filterpricescheckbox;
	@FindBy(xpath="//button[text()='Mobiles']")
	WebElement Mobilelink;
	
	public void ClickonTodayslink() {
		se=new SeleniumReusables(driver);
		se.click(Todaysealslink);
	}
	
	public void Clickoncheckbox() {
		se.Scrolldown(Primeexclusivecheckbox);
		se.click(Primeexclusivecheckbox);
	}
	
	public void Clickonelectronics() {
		se.click(Electronicslink);
	}
	
	public void ClickAmazonDevicecheckbox() {
		se.click(AmazonDevicecheckbox);
	}
	
	
	public void ClickAmazonbaicscheckbox() {
		se.click(Amazonbaicscheckbox);
	}
	
	public void ClickFilterpricescheckbox() {
		se.click(Filterpricescheckbox);
	}
	
	public void Clickonmobilelink() {
		se.click(Mobilelink);
	}

}
