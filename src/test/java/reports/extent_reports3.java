package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extent_reports3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExtentReports extentreports = new ExtentReports();
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\EReports\\report2.html");
		ExtentSparkReporter sparkreporter_fail = new ExtentSparkReporter(System.getProperty("user.dir")+"\\EReports\\reportfail.html");
		//extent reports for only failed testcase
		sparkreporter_fail.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
		extentreports.attachReporter(sparkreporter , sparkreporter_fail);
		
		extentreports.createTest("Test101", "Sample Test").assignAuthor("Karthik").assignCategory("Smoke")
		.assignDevice("Chrome Os").pass("This is passed");
		
		extentreports.createTest("Test102", "Sample Test").assignAuthor("Jani").assignCategory("Regression")
		.assignDevice("EDGE Os").pass("This is passed");
		
		extentreports.createTest("Test103", "Sample Test").assignAuthor("Jani").assignCategory("Regression")
		.assignDevice("FIREFOX Os").pass("This is passed");
		
		extentreports.createTest("Test104", "Sample Test").assignAuthor("Gopi").assignCategory("A11y")
		.assignDevice("SAFARI Os").fail("Failed");
		
		
		
		
		
		
		
		
		
		extentreports.flush();
		
		
	}

}
