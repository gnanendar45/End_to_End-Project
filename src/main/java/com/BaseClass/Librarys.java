package com.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Librarys {

	public static WebDriver driver;
	public static Properties prop;
	public void launchApplication() throws IOException {
		FileInputStream input= new FileInputStream("src/test/resources/Screenshot/Config.properties");
		prop= new Properties();
		prop.load(input);
		
		try {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				
			}

			else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
      catch(Exception e) {
    	  System.out.println("Browser didnt launch");
      }
}
	public void teardown() {
		driver.close();
	}
}
