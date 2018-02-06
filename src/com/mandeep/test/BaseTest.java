package com.mandeep.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mandeep.locator.PasswordPage;
import com.mandeep.locator.UserNamePage;

public class BaseTest {
	
	//create instance
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver,20);
	String uRL = "https://gmail.com";
	String email = "koodosscommerce@gmail.com";
	String passwordx = "koodouat123";
	
	UserNamePage unp = new UserNamePage(driver);
	PasswordPage pwp = new PasswordPage(driver);
	
	//OpenBrowser
	@BeforeClass
	public void openBrowser() {
		driver.get(uRL);
		driver.manage().window().maximize();
		System.out.println("-----------------2.baseTest.openBrowser------------------");
	}
	
	//CloseDriver
	@AfterClass
	public void quitDriver() {
		driver.quit();
		System.out.println("-----------------10.quitDriver------------------");
	}



}
