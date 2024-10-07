package com.PractiesOOPSConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PractiesOOPSConcepts.LoginPage.FacebookLoginPage;


public class FacebookLoginTest {

	 WebDriver driver;
	 	FacebookLoginPage loginPage;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();

	        loginPage = new FacebookLoginPage(driver);
	    }

	    @Test
	    public void loginToFacebook() {
	        driver.get("https://www.facebook.com/");
	        loginPage.enterEmail("your_email");
	        loginPage.enterPassword("your_password");
	        loginPage.clickLogin();
	        // Add assertions to verify login success
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
}
