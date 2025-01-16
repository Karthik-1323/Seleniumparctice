package com.SeleniumPractice;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basiclocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=cms/feature");
		// driver.get("https://www.orangehrm.com/");
		// By Email
		// driver.findElement(By.name("EmailHomePage")).sendKeys("karthik@gmail.com");
		// driver.close();
		// By id
		// driver.findElement(By.id("Form_submitForm_action_request")).click();
		// By linktext
		// driver.findElement(By.linkText("Privacy Policy.")).click();
		// By partial linktext
		// driver.findElement(By.partialLinkText("Privacy Policy")).click();

		// By class(used to locate group of webelements of one category)

		List<WebElement> navbar = driver.findElements(By.className("list-unstyled"));
		System.out.println(navbar.size());
		
		// By tagname(used to locate group of webelements of one category)
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		
	}

}
