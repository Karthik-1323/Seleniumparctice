package com.SeleniumPractice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//driver.get("https://testautomationpractice.blogspot.com/");
		driver.get("https://www.opencart.com/index.php?route=cms/feature");
		driver.manage().window().maximize();
		
		//Fullpage
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trgt = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		src.renameTo(trgt);*/
		
		//section of page screenshot
		/*WebElement ele = driver.findElement(By.xpath("//table[@name='BookTable']"));
		File source = ele.getScreenshotAs(OutputType.FILE);
		File Target = new File(System.getProperty("user.dir")+"\\Screenshots\\sectionofpage.png");
		source.renameTo(Target);*/
		
		//Particular element
		WebElement e = driver.findElement(By.xpath("//img[@title='OpenCart - Features']"));
		File s = e.getScreenshotAs(OutputType.FILE);
		File t = new File(System.getProperty("user.dir")+"\\Screenshots\\element.png");
		s.renameTo(t);
		
		
		
		
		
	}

}
