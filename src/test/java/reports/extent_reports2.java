package reports;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extent_reports2 {
	
	static WebDriver  driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExtentReports extentreports = new ExtentReports();
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\EReports\\report1.html");
		extentreports.attachReporter(sparkreporter);
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		extentreports.createTest("Screenshot Test1", "This is to capture Screenshot").info("info msg").addScreenCaptureFromBase64String(screenshotcapture());
		
		extentreports.createTest("Screenshot Test2", "This is to capture Screenshot").info("info msg").addScreenCaptureFromBase64String(screenshotcapture() , "Google");
		
		extentreports.createTest("Screenshot Test3", "This is to capture Screenshot").info("info msg").addScreenCaptureFromPath(capturessandReturnpath("Goooogle.png"));
		
		extentreports.createTest("Screenshot Test4", "This is to capture Screenshot").info("info msg").fail(MediaEntityBuilder.createScreenCaptureFromBase64String(screenshotcapture()).build());
		
		extentreports.createTest("Screenshot Test5", "This is to capture Screenshot").info("info msg").skip(MediaEntityBuilder.createScreenCaptureFromPath(capturessandReturnpath("Gooooooogle.png"), "Google").build());
		extentreports.flush();
		driver.close();
	}

		
		public static String screenshotcapture() {
		TakesScreenshot ts = (TakesScreenshot)driver;
		String S = ts.getScreenshotAs(OutputType.BASE64);
		
		
		return S;
		}
		
		public static String capturessandReturnpath (String filename) {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File trgt = new File(System.getProperty("user.dir")+"\\Screenshots\\"+filename);
			src.renameTo(trgt);
			return trgt.getAbsolutePath();
			
		}
		
	}
		
	


