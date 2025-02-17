package Tstngdemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C1 {
	
	
	@Test
	void abc() {
		
		System.out.println("m1");
		
	}
	
	@BeforeMethod
    void def() {
	
	System.out.println("m2");
		
		
	}

}
