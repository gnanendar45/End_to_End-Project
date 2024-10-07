package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage {
	
	WebDriver driver;
	
	public  TestPage(WebDriver driver) {
		this.driver=driver;
		
	}
	@FindBy(xpath="//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/span/span/span")
	WebElement radiobutton;
	
	public void ClickRadiobutton() {
		radiobutton.click();
	}

}
