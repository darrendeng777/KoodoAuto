package com.koodo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.koodo.locator.HomePage;
import com.koodo.locator.LoginPage;

public class VerifySelfserve {
	
	//1.to create webdriver
	WebDriver driver = new FirefoxDriver();
	HomePage hp = new HomePage(driver);
	LoginPage lp = new LoginPage(driver);
	
	//2.go to koodo site
	@BeforeClass
	public void goToKoodo() {
		driver.get("https://www.koodomobile.com");
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
		
		//driver.findElement(By.xpath("(//a[contains(text(),'Self Serve')])[2]")).click();
		hp.clickOnSelfServeLink();
	}
	
	//5.type in credential
	@Test(priority=3)
	public void typeCredential() {
		lp.enterUserName("sheldon_hua@telusinternal.com");
		lp.enterPassWord("Koodouat1234");
		//driver.findElement(By.xpath("//input[@name='IDToken1']")).sendKeys("sheldon_hua@telusinternal.com");
		//driver.findElement(By.xpath("//input[@name='IDToken2']")).sendKeys("Koodouat1234");
		
	}
	
	//6.close driver
	@AfterClass
	public void closeMyDriver() {
		driver.close();
	}

}
