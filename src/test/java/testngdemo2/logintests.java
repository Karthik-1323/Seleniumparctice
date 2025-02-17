package testngdemo2;

import org.testng.annotations.Test;

public class logintests {
	
	
	@Test(priority = 1, groups = {"Sanity"})
	void loginbyEmail()
	{
		
		System.out.println("email...");
		
	}
	
	@Test(priority = 2, groups = {"Regression"})
	void loginbyFacebook()
	{
		
		System.out.println("Facebook...");
	}
	
	@Test(priority = 3, groups = {"Sanity" , "Regression" , "Functional"})
	void loginbyTwitter()
	{
		System.out.println("Twitter...");
		
	}

}
