package com.koodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhonePageLocator {
	
		WebDriver driver;
		By androidFilter = By.xpath("(//a[@data-koodo-tracking='PhoneListingBTN_Deals_Filter'])[1]");
		//By iphoneFilter
		//By onlineOnLYFilter
	
		
		public PhonePageLocator(WebDriver driver) {
			this.driver=driver;
		}
		
		public void androidFilterClick() {
			driver.findElement(androidFilter).click();
		}
		
}


