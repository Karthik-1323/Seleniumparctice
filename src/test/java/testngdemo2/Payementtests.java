package testngdemo2;

import org.testng.annotations.Test;

public class Payementtests {
	
	@Test(priority = 1, groups = {"Sanity"})
	void paymentinRupees() {

		System.out.println("Rupees...");

	}

	@Test(priority = 2, groups = {"Regression"})
	void paymentinDollars() {

		System.out.println("Dollars...");
	}

	@Test(priority = 3, groups = {"Sanity" , "Regression" , "Functional"})
	void paymentinPounds() {
		System.out.println("Pounds...");

	}

}
