package com.koodo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	

	//create instance
	WebDriver driver = new FirefoxDriver();
	ReadProperties rp =  new ReadProperties();
	homePageLocator hpl = new homePageLocator(driver);
	PhonePageLocator ppl = new PhonePageLocator(driver);
	String uRL = rp.getURL();
	String userName = rp.getUserName();
    String passWord = rp.getPassWord();
	WebDriverWait wait = new WebDriverWait(driver, 20);
    
	
	//start browser
	@BeforeClass
	public void startBrowser() {
		driver.get(uRL);
		//driver.manage().window().maximize();
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	//close browser
		@AfterClass
		public void closeBrowser() {
			driver.quit();
    }

}
