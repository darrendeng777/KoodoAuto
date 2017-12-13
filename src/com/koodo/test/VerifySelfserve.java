package com.koodo.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.koodo.locator.HomePage;
import com.koodo.locator.LoginPage;

public class VerifySelfserve {
	
	//1.create all instance
	WebDriver driver = new FirefoxDriver();
	HomePage hp = new HomePage(driver);
	LoginPage lp = new LoginPage(driver);
	Properties pro;
	GetProperties gp = new GetProperties();
	String userName = gp.getUserName();
	String uRL = gp.getURL();
	
	//2.go to koodo site
	@BeforeClass
	public void goToKoodo() {
		driver.get(uRL);
		driver.manage().window().maximize();
	}
	
	
	//3.verify if you are in koodo site
	@Test(priority=1)
	public void verifyKoodoTitle() {
		String expectTitle = "Choose Happy | Koodo Mobile";
		String actualTitle = driver.getTitle();
		System.out.println("Your page title is "+actualTitle);
		Assert.assertEquals(actualTitle, expectTitle);
		
	}
	

	//4.click on self serve
	@Test(priority=2)
	public void verifyClickSelfServe() {
		
		hp.clickOnSelfServeLink();
	}
	
	//5.type in credential and login
	@Test(priority=3)
	public void typeCredential() {
		lp.enterUserName(userName);
		lp.enterPassWord("Koodouat1234");
		lp.clickLogin();
	}
	
	//6.close driver
	@AfterClass
	public void closeMyDriver() {
		driver.close();
	}

}
