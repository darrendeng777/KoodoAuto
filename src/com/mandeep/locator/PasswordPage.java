package com.mandeep.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordPage {
	WebDriver driver;
	By password = By.id("password");
	By passwordNextButton = By.id("passwordNext");
	
	public PasswordPage(WebDriver driver) {
		this.driver=driver;
	}
	

	public void enterPassword(String z) {
		driver.findElement(password).sendKeys(z);
		System.out.println("-----------------6.enterPassword method------------------");
	}
	
	public void clickPasswordButton() {
		driver.findElement(passwordNextButton).click();
		System.out.println("-----------------7.clickPasswordButton------------------");
	}

}
