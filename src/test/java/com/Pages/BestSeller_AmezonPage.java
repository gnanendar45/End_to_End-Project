package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Librarys;
import com.ReusableFunctions.SeleniumReusables;

public class BestSeller_AmezonPage extends Librarys{

	SeleniumReusables se;
	
	public  BestSeller_AmezonPage() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='nav-xshop']/a[4]")
	WebElement Bestsellerlink;
	@FindBy(xpath="//a[text()='Hot New Releases']")
	WebElement HotNewReleseslink;
	@FindBy(xpath="//a[text()='Electronics']")
	WebElement Electronicslink;
	@FindBy(xpath="//a[text()='Computers & Accessories']")
	WebElement ComputerAccessorieslink;
	@FindBy(xpath="//a[text()='Audio & Video Accessories']")
	WebElement AudioVideoAccessorieslink;
	@FindBy(xpath="//*[@id=\"p13n-asin-index-3\"]/div")
	WebElement fourththlinkHikvision;
	
	public void ClickonBestsellerlink() {
		se=new SeleniumReusables(driver);
		se.click(Bestsellerlink);
	}
	public void ClickonHotnewreleswlink() {
		se.click(HotNewReleseslink);
	}
	public void ClickonElectronicslink() {
		se.click(Electronicslink);
	}
	public void ClickonComputeraccessorieslink() {
		se.click(ComputerAccessorieslink);
	}
	public void ClickonAudiovideoaccessorieslink() {
		se.click(AudioVideoAccessorieslink);
	}
	public void Clickon4thlinkHikvision() {
		se.click(fourththlinkHikvision);
	}
}
