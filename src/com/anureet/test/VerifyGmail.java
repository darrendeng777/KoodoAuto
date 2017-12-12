package com.anureet.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.anureet.locator.HomePage;
import com.anureet.locator.LoginPage;





public class VerifyGmail {
	
	WebDriver driver = new FirefoxDriver();
	HomePage hp =new HomePage(driver);
	LoginPage lp = new LoginPage(driver);
	
	WebDriverWait wait = new WebDriverWait(driver, 20);

//1 Go to the gmailsite.
@BeforeClass
public void GotoGmail() {
	driver.get("https://gmail.com");
	
	
		
}

//2 Verify the title
@Test(priority=1)
public void VerifyTitle() {
	String expectTitle = "Gmail";
	String actualTitle = driver.getTitle();
	
	System.out.println("Title of the page is="+actualTitle);
	Assert.assertEquals(actualTitle, expectTitle);
}
	

//3Enter email and click next
@Test(priority=2)
public void EnterUsername() {
	lp.enterUsername("koodosscommerce@gmail.com");
	lp.clickNext();
	
	
    
}
	
	
//4 Enter password and click next
@Test(priority=3)
public void EnterPassword () {
	wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
	lp.enterPassword("koodouat123");
	lp.passWordNext();
	
}

//5 Verify that you are logged in
@Test(priority=4)
public void verifyHomePage() {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#inbox']")));
	String expectTitle = "Inbox (59) - koodosscommerce@gmail.com - Gmail";
	String actualTitle = driver.getTitle();
	
	System.out.println("Homepage title is ="+actualTitle);
	//Assert.assertEquals(actualTitle, expectTitle);
	Assert.assertTrue(actualTitle.contains(expectTitle));
	
}

//6 close driver
@AfterClass
public void closeDriver() {
	driver.quit();
}

}

