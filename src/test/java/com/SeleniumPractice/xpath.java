package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.get("https://www.orangehrm.com/");

		driver.get("https://www.opencart.com/index.php?route=cms/feature");

		// Syntax of xpath:
		// tagname[@attribute='value'] or //*[@attribute='value']

		// driver.findElement(By.xpath("//input[@tabindex='1']")).sendKeys("kk@gmail.com");
		// driver.findElement(By.xpath("//input[@id='Form_submitForm_action_request']")).click();
		// driver.findElement(By.xpath("//input[@type='text'][@name='subdomain']")).sendKeys("gtrf");

		// x path with and operator
		// driver.findElement(By.xpath("//input[@type='text' and
		// @name='subdomain']")).sendKeys("gtrf");
		// x path with OR operator
		// driver.findElement(By.xpath("//input[@type='text' or
		// @name='subdomain']")).sendKeys("gtrf");
		// x path with inner text
		// driver.findElement(By.xpath("//*[text()='Privacy Policy.']")).click();
		//driver.findElement(By.xpath("//a[text()='Blog']")).click();
		// driver.close();
		
		// X path with contains
		// driver.findElement(By.xpath("//input[contains(@id,'Form_submitForm_')]")).click();
		//driver.findElement(By.xpath("//input[contains(@type,'tex')]")).sendKeys("asfg");
		
		// X path with starts-with
		//driver.findElement(By.xpath("//input[starts-with(@type,'tex')]")).sendKeys("asfg");
		//chained xpath(combination of relative and absolute xpath)
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]/a")).click();
		
	}

}
