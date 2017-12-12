package com.mandeep.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mandeep.locator.UserNamePage;

public class BaseTest {
	
	//create instance
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver,20);
	String uRL = "https://gmail.com";
	UserNamePage unp = new UserNamePage(driver);
	
	//OpenBrowser
	@BeforeClass
	public void openBrowser() {
		driver.get(uRL);
		
	}
	
	//CloseDriver
	@AfterClass
	public void quitDriver() {
		driver.quit();
	}



}
