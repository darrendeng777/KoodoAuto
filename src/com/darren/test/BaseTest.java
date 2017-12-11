package com.darren.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.darren.locator.UserNameLoginPage;

public class BaseTest {
	
	//create instance
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver,20);
	String uRL = "https://gmail.com"; 
	UserNameLoginPage unlp = new UserNameLoginPage(driver); 
	
	//open browser and URL
	@BeforeClass
	public void OpenBrowser() {
		driver.get(uRL);
	}
	
	//close driver
	@AfterClass
	public void closeDriver() {
		driver.quit();
	}


}
