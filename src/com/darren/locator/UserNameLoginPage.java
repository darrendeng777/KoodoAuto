package com.darren.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserNameLoginPage {
	
	WebDriver driver;
	By userNameField = By.id("identifierId");
	By clickNext = By.id("identifierNext");
	
	//create constructor
	public UserNameLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//enterUsername
	public void enterUserName(String email) {
		driver.findElement(userNameField).sendKeys(email);
	}
	
	//click next button
	public void clickNext() {
		driver.findElement(clickNext).click();
	}

}
