package com.PractiesOOPSConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	// Facebook LoginPage class
	public class FacebookLoginPage extends BaseClass { //using in ENCAPTULATION like Parant class to child class
	    @FindBy(id="email")
	     WebElement emailField;

	    @FindBy(id="pass")
	    WebElement passwordField;

	    @FindBy(id="loginbutton")
	    WebElement loginButton; 


	    public FacebookLoginPage(WebDriver driver) {
	        super(driver);
	    }

	    public void enterEmail(String email) {
	        emailField.sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickLogin() 
	 {
	        loginButton.click();

	    }
	}


}
