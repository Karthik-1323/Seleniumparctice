package Tstngdemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

	@Test
	void xyz() {

		System.out.println("m5");
	}

	@BeforeSuite
	void op() {

		System.out.println("m6");
	}

	@AfterSuite
	void qr() {

		System.out.println("m7");
	}

}
