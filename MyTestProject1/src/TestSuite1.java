import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.*;


public class TestSuite1 {
	
	public static WebDriver browser;

	@Before
	public void beforeEachTest() {
		        		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		browser = new ChromeDriver();
		
		browser.get("https://saucelabs.com");   
		   
	 }
	
	/*@Test
	public void testWithFireFox() {
		
		WebDriver driver;   

		//Firefox's geckodriver requires you to specify its location.    
		
		System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver-v0.19.1-win32\\geckodriver.exe");   

		driver = new FirefoxDriver();     
		
		driver.get("http://saucelabs.com");   

		WebElement header = driver.findElement(By.id("site-header"));   

		assertTrue((header.isDisplayed()));   

		driver.close();
	}*/
	
	@Test
	public void  verifySiteHeaderTest() {
		
		HomePage homePage = new HomePage();
		homePage.verifySiteHeader();
				
	}
	
	@Test 
	public void  gotoFreeTrailTest() throws InterruptedException {
		HomePage homePage = new HomePage();
		homePage.clickFreeTrail();
		Thread.sleep(2000);
	}
		
	 @After
	 public void afterEachTest() {
		 
		 browser.quit();
		 
	 }
	 
	 
	

}
