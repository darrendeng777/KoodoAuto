package com.anureet.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
	this.driver = driver;
	}
	
	//list of locators
	By Username = By.xpath("//input[@ id='identifierId']");
	//By Password = By.xpath("//div[@ class='rFrNMe P7gl3b sdJrJc Tyc9J']");
	By passWord = By.id("password");
	By clickNext = By.id("identifierNext");
	By passWordNext = By.id("passwordNext");
	
	
	
//enterUsername
	public void enterUsername(String user) {
		driver.findElement(Username).sendKeys(user);
		
	}
	//enter Password
	public void enterPassword(String pass) {
		driver.findElement(passWord).sendKeys(pass);
	}
	
	//click next button
	
	public void clickNext() {
		driver.findElement(clickNext).click();
		
	}
	//click next button after entering Password
	public void passWordNext() {
		driver.findElement(passWordNext).click();
	}
}