package com.koodo.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By userName = By.xpath("//input[@name='IDToken1']");
	By passWord = By.xpath("//input[@name='IDToken2']");
	
	public void enterUserName(String user) {
		driver.findElement(userName).sendKeys(user);
	}
	
	public void enterPassWord(String psd) {
		driver.findElement(passWord).sendKeys(psd);
	}
}
