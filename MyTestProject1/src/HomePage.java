import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class HomePage {

	WebDriver driver = TestSuite1.browser;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "site-header")
	WebElement siteHeader;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[2]/a[1]")
	WebElement freeTrailButton;
	
	public void verifySiteHeader(){
		assertTrue((siteHeader.isDisplayed()));   
	}
	
	public void clickFreeTrail() {
		freeTrailButton.click();
	}
	
}
