package com.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class navMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Navigation methods:
		//navigate().to()
		//navigate().back()
		//navigate().refresh()
		//navigate().forward()
		
		WebDriver driver  = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		
		
		driver.get("https://www.opencart.com/index.php?route=cms/feature");
		
		driver.manage().window().maximize();
		
		WebElement l = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Register']/following::div/a[1]")));
		l.click();
		
		//navigate().to()
		driver.navigate().to("https://www.orangehrm.com/");
		
		//navigate().back()
		driver.navigate().back();
		
		//navigate().forward()
		driver.navigate().forward();
		
		//navigate().refresh()
		driver.navigate().refresh();
		
		driver.quit();
		
		
		
	}

}
