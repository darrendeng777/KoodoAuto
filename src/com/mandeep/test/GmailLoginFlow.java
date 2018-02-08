package com.mandeep.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailLoginFlow extends BaseTest{
	

	
	//enterUserName
	@Test(priority=1)
	public void enterUserName() {
		unp.enterUserName();
		unp.clickUserNameButton();
	}
	
	//enterPassWord
	@Test(priority=2)
	public void enterPassWord() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("koodouat123");
		driver.findElement(By.id("passwordNext")).click();
		
	}
	
	//verifyLoginTItle
	@Test(priority=3)
	public void verifyLoginTitle() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#inbox']")));
		String expectedTitle = "koodosscommerce@gmail.com";
		String actualTitle = driver.getTitle();
		System.out.println("--------This is the title------- "+actualTitle);
		Assert.assertTrue(actualTitle.contains(expectedTitle));
		
	}
	
}
