package com.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlingalertusingexplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		/*WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button#alertBtn")).click();
		
		Alert t = mywait.until(ExpectedConditions.alertIsPresent());
		
		t.accept();*/
		
		
		//authenticated pop
		
		//driver.get("https://the-internet.herokuapp.com/digest_auth");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		

	}

}
