package testngdemo2;

import org.testng.annotations.Test;

public class signupTests {

	@Test(priority = 1, groups = {"Sanity"})
	void signupbyEmail() {

		System.out.println("Semail...");

	}

	@Test(priority = 2, groups = {"Regression"})
	void signupbyFacebook() {

		System.out.println("SFacebook...");
	}

	@Test(priority = 3, groups = {"Sanity", "Regression" , "Functional"})
	void signupbyTwitter() {
		System.out.println("STwitter...");

	}

}
