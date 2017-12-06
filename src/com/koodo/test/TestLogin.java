package com.koodo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin {
	
/*	public static void main(String a[]) {
		System.out.println("this is a java or testng");
	}*/
	
	WebDriver driver = new FirefoxDriver();
	@BeforeClass
	public void openKoodoWeb() {
		driver.get("https://www.koodomobile.com");
	}
	
	@Test(priority=1,description="this is to verify the page title")
	public void koodoHomePage(){
		
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Koodo"));
		System.out.println("This method goes to koodo homnepage");
		
	}
	
	@Test(priority=2)
	public void login(){
        driver.findElement(By.xpath("(//a[contains(text(),'Self Serve')])[2]")).click();
		System.out.println("This method check title");
	}
	
	@Test(priority=3)
	public void enterCredential(){
		driver.findElement(By.xpath("//input[@name='IDToken1']")).sendKeys("sheldon_hua@telusinternal.com");
		driver.findElement(By.xpath("//input[@name='IDToken2']")).sendKeys("Koodouat1234");
		System.out.println("This method check login");
	}
	
	@AfterClass
	public void closeDriver() {
		driver.close();
	}
	


}
