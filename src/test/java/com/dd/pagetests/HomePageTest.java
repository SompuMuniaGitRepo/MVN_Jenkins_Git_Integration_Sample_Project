package com.dd.pagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {

	@Test(priority=1)
	public void homepageTest() {
		  System.out.println("Testing Home page");
	}
	
	@Test(priority= 2)
	public void testfail()  {
		Assert.fail("Deliberately failing this TC");
	}
	
	@Test(priority=3)
	public void testpass() {
		Assert.assertTrue(1>0);
		
	}
	
	@Test(priority=4,dependsOnMethods= {"testfail"})
	public void testskip() {
		System.out.println("This method should be skipped");
	}
}
