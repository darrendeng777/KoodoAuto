package com.mandeep.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserNamePage {
	WebDriver driver;
	By userName = By.id("identifierId");
	By userNameNextButton = By.id("identifierNext");
	
	public UserNamePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUserName() {
		driver.findElement(userName).sendKeys("koodosscommerce@gmail.com");
	}
	
	public void clickUserNameButton() {
		driver.findElement(userNameNextButton).click();
	}

}
