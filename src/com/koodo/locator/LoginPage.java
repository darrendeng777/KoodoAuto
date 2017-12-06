package com.koodo.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//list of locator
	By userName = By.xpath("//input[@name='IDToken1']");
	By passWord = By.xpath("//input[@name='IDToken2']");
	By loginButton = By.xpath("//button[@type='submit']");
	
	//to enter username
	public void enterUserName(String user) {
		driver.findElement(userName).sendKeys(user); 
	}
	
	//to enter password
	public void enterPassWord(String psd) {
		driver.findElement(passWord).sendKeys(psd);
	}
	
	//to click on login button
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
}
