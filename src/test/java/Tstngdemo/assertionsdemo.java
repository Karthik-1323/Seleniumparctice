package Tstngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionsdemo {
	
	
	@Test
	void yui()
	{
		
		String s1 = "opentext";
		String s2 = "opencart";
		
		/*if(s1.equals(s2)) {
			
			System.out.println("test passed");
		}
		
		else {
			
			System.out.println("test failed");
		}
		
		Assert.assertEquals(s1, s2);
		*/
		
		//if we want to asset in if condition
		
	/*if(s1.equals(s2)) {
			
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		
		else {
			
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
		*/
		
		//Softassertion
		
if(s1.equals(s2)) {
			
			System.out.println("test passed");
		}
		
		else {
			
			System.out.println("test failed");
		}

SoftAssert sa = new SoftAssert();
sa.assertEquals(s1, s2);
sa.assertAll(); // if this method is not used it will always show as pass

		
		
	}

}
