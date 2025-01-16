package com.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlealerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		// simple alert
		// driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		/*
		 * Alert al= driver.switchTo().alert();
		 * 
		 * System.out.println(al.getText());
		 * 
		 * al.accept();
		 */

		// confirmation alert

		// driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		// Alert a = driver.switchTo().alert();
		// a.accept();
		// a.dismiss();

		// prompt alert
		/*
		 * driver.findElement(By.xpath("//button[@id='promptBtn']")).click(); Alert ale
		 * = driver.switchTo().alert(); ale.accept(); ale.dismiss();
		 * ale.sendKeys("karthik");
		 */

	}

}
