package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	 WebDriver driver;
	 public void setUp() {
	        // Set path to chromedriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize WebDriver
	        driver = new ChromeDriver();
	        TestPage tp=new TestPage(driver);
	        driver.get("https://www.gotomytrip.com");
	        
	        @Test
	        public void RadioButton() {
	        	tp.ClickRadiobutton();
	        }

	 }

}
