package com.darren.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.darren.locator.UserNameLoginPage;

public class GmailLogin extends BaseTest {
	
	//enter Username and click on next
	@Test(priority=1)
	public void enterUserNameCredential() {
		unlp.enterUserName(userName);
		unlp.clickNext();
	}
	
	//enter password and click on next 
	@Test(priority=2)
	public void enterPassword() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("koodouat123");
		driver.findElement(By.id("passwordNext")).click();
		
	}
	
	//verify after login 
	@Test(priority=3)
	public void verifyAfterLogin() {
		String ExpectedTitle = "Inbox";
		String ActualTitle = driver.getTitle();
		Assert.assertTrue(ActualTitle.contains(ExpectedTitle));
	}
	


}
