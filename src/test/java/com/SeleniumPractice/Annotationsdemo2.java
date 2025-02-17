package com.SeleniumPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotationsdemo2 {
	
	
	@BeforeClass
	void login()
	{
		
		System.out.println("login...");
	}

	@Test(priority=1)
	void search()
	{
		
		System.out.println("search...");
	}
	
	@Test(priority=2)
	void advsearch()
	{
		
		System.out.println("advsearch...");
	}
	
	
	@AfterClass
	void logout()
	{
		
		System.out.println("logout...");
	}
}
