package com.mandeep.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailLoginFlow extends BaseTest{
	

	
	//enterUserName
	@Test(priority=1)
	public void enterUserName() {
		unp.enterUserName(email);
		unp.clickUserNameButton();
		System.out.println("-----------------5.GmailLoginFlow.enterUserName------------------");
	}
	
	//enterPassWord
	@Test(priority=2)
	public void enterPassWord(){
		
    wait.until(ExpectedConditions.elementToBeClickable(By.id("passwordNext")));
	
	pwp.enterPassword(passwordx);	
	pwp.clickPasswordButton();	
	System.out.println("-----------------8.GmailPasswordFlow.enterPassword------------------");
		
	}
	
	//verifyLoginTItle
	@Test(priority=3)
	public void verifyLoginTitle() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#inbox']")));
		String expectedTitle = "koodosscommerce@gmail.com";
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains(expectedTitle));
		System.out.println("-----------------9.GmailLoginFlow.verifyLoginTitle------------------");
	}
	
}
