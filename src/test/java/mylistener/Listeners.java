package mylistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{
	
	 public void onStart(ITestContext context) {
		    
		 System.out.println("Test execution started...");		  }
	 
	 public  void onTestStart(ITestResult result) {
		    
		 System.out.println("teststarted");
		  }
	 
	 public  void onTestSuccess(ITestResult result) {
		 System.out.println("test succeeded");
		  }
	 
	 public  void onTestFailure(ITestResult result) {
		 System.out.println("test failed");
		  }
	 
	 public  void onTestSkipped(ITestResult result) {
		 System.out.println("test skipped");
	 }
	 
	 public  void onFinish(ITestContext context) {
		 System.out.println("test finished");
		  }
	 
	 

}
