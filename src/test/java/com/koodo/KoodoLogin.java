package com.koodo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoodoLogin extends BaseTest{
	
	
	//go to login page
	@Test(priority=1)
	public void goToLoginPage() {
		lpl.enterLoginPage();
	}
	
	//enter credential
	@Test(priority=2)
	public void enterCredential() {
		lpl.enterUserName(userName);
		lpl.enterPassWord(passWord);
		lpl.clickOnLogin();
	}
	
	//verify title
	@Test(priority=3)
	public void verifyTitle() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'View my bill')]")));
		String expectedTitle = "Overview";
		String actualTitle = driver.getTitle();
		System.out.println("====The current title is "+actualTitle);
		Assert.assertTrue(actualTitle.contains(expectedTitle));
	}
	

}
