package Tstngdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class C2 {

	@Test
	void ghi() {

		System.out.println("m3");

	}

	@AfterMethod
	    void jkl() {
		
		System.out.println("m4");
			
			
		}
}
