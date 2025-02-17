package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extent_reports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports extentreports = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\EReports\\report.html");
		extentreports.attachReporter(sparkReporter);
		
		ExtentTest test1 = extentreports.createTest("Test1");
		test1.pass("PASSED");
		
		ExtentTest test2 = extentreports.createTest("Test2");
		test2.skip("<i>SKIPPED</i>");
		
		ExtentTest test3 = extentreports.createTest("Test3");
		test3.log(Status.FAIL, "<b>This is a failed testcase</b>");
		
		
		
		extentreports.flush();

	}

}
