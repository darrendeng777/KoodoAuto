package com.mandeep.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class UserNamePage {

	WebDriver driver;
	By userName = By.id("identifierId");
	By userNameNextButton = By.id("identifierNext");
	
	public UserNamePage(WebDriver driver) {
		this.driver=driver;//telling const to pass the driver 
		System.out.println("-----------------1.UserNamePage contrustor------------------");
	}
	
	public void enterUserName(String x) {
		driver.findElement(userName).sendKeys(x);
		System.out.println("-----------------3.enterUserName method------------------");
	}
	
	public void clickUserNameButton() {
		driver.findElement(userNameNextButton).click();
		System.out.println("-----------------4.clickUserNameButton------------------");
	}

}
