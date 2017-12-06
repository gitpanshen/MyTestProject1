import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class myTestCase1 {

	@Before
	public void beforeEachTest() {
		   
	 }
	
	@Test
	public void testWithFireFox() {
		
		WebDriver driver;   

		//Firefox's geckodriver requires you to specify its location.    
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pansh\\Downloads\\geckodriver-v0.19.1-win32\\geckodriver.exe");   

		driver = new FirefoxDriver();     
		
		driver.get("http://saucelabs.com");   

		WebElement header = driver.findElement(By.id("site-header"));   

		assertTrue((header.isDisplayed()));   

		driver.close();
	}
	
	@Test
	public void  testWithChrome() {
		
		WebDriver browser;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pansh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		browser = new ChromeDriver();
		
		browser.get("http://saucelabs.com");   

		WebElement header = browser.findElement(By.id("site-header"));   

		assertTrue((header.isDisplayed()));   

		browser.close();
	}
		
	 @After
	 public void afterEachTest() {
		 
	 }
	 
	 
	

}
