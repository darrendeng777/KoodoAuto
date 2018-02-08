package com.koodo;

import org.testng.annotations.Test;

public class phonePage extends BaseTest{
	
	//1.go to the phone's page
	@Test(priority=1)
	public void goToPhonePage() throws InterruptedException {
		Thread.sleep(5000);
		hpl.clickOnShopPhone();
	}
	//2.click on the filter
	@Test(priority=2)
	public void clickOnFilter() {
		ppl.androidFilterClick();
	}

}
