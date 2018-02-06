package com.koodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePageLocator {
	WebDriver driver;
	By loginPage = By.xpath("(//a[contains(text(),'Self Serve')])[2]");
	By userName = By.id("IDToken1");
	By passWord = By.id("IDToken2");
	By loginButton = By.xpath("//button[@type='submit']");
	By shopPhoneButton = By.xpath("//*[@id=\"block-block-121\"]/div/div/section[2]/ul/li[1]/div/a/span");
	
	//contructor
	public homePageLocator(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterLoginPage() {
		driver.findElement(loginPage).click();
	}
	
	public void enterUserName(String userName1) {
		driver.findElement(userName).sendKeys(userName1);
	}
	
	public void enterPassWord(String passWord1) {
		driver.findElement(passWord).sendKeys(passWord1);
	}
	
	public void clickOnLogin() {
		driver.findElement(loginButton).click();
	}
	
	public void clickOnShopPhone() {
		driver.findElement(shopPhoneButton).click();
	}

}
