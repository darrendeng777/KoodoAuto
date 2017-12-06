package com.koodo.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	By selfServeLink = By.xpath("(//a[contains(text(),'Self Serve')])[2]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnSelfServeLink() {
		driver.findElement(selfServeLink).click();
	}

}
