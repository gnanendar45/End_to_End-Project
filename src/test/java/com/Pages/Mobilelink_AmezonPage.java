package com.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v122.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Librarys;
import com.ReusableFunctions.SeleniumReusables;

public class Mobilelink_AmezonPage extends Librarys{

	SeleniumReusables se;
	public  Mobilelink_AmezonPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='nav-xshop']/a[5]")
	WebElement mobilelink;
	@FindBy(xpath="//*[@id='nav-subnav']/a[4]/span[1]")
	WebElement TvHomeenterinments;
	@FindBy(xpath="//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img18/Electronics/Megamenu/megamenumar18f.json:subnav-sl-megamenu-3:0\"]/div[2]/div/div[2]/ul/li[4]/a")
	WebElement LGLink;
	@FindBy(xpath="//*[@id=\"s-refinements\"]/div[3]/ul/li/span/a/div/label/i")
	WebElement Elgiblecheckbox;
	@FindBy(xpath=" //*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div")
	List<WebElement> Entairepricelist;
	
	public void Clickmobilelink() {
		se=new SeleniumReusables(driver);
		se.click(mobilelink);
	}
	public void Clicktvhome() throws InterruptedException {
		se.moucehover(TvHomeenterinments);
	}
	public void ClickLglink() {
		System.out.println("enterthe LG link");
		se.click(LGLink);
	}
	public void Clickcheckbox() {
		System.out.println("enter the checkbox");
		se.click(Elgiblecheckbox);
	}
	
}
