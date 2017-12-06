package com.koodo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test(priority=1,description="This is the test for xxxxx")
	public void test1() {
		System.out.println("This is our 1st test method");
	}
	
	@Test(priority=2)
	public void anureettest() {
		System.out.println("This is our 2nd test method");
		Assert.assertTrue(false);
	}
	
	@Test(priority=3)
	public void darrentest() {
		System.out.println("This is our 3rd test method");
	}

}
