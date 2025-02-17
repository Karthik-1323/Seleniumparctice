package com.SeleniumPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Login ----- @BeforeMethod
 * Search ------- @Test
 * Logout ------- @AfterMethod
 * Login
 * Advanced Search ----- @Test
 * Logout
 */

public class annotationsdemo {
	
	
	@BeforeMethod
	void login()
	{
		
		System.out.println("login...");
	}
	
	@Test(priority = 1)
	void search() 
	{
		
		System.out.println("search..");
	}
	
	@Test(priority = 2)
	void advancesearch()
	{
		
		System.out.println("advsearch..");
	}
	
	
	@AfterMethod
	void logut()
	{
		System.out.println("logout..");
		
	}

}
