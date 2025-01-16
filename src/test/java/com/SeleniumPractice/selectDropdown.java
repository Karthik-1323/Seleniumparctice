package com.SeleniumPractice;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement drpele = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select drp = new Select(drpele);
		
		//Types of methods
		
		//drp.selectByVisibleText("India");
		//drp.selectByValue("france");
		//drp.selectByIndex(3);
		
		//capture all options from dropdown
		
		List<WebElement> l = drp.getOptions();
		
		System.out.println(l.size());
		
		//printing the option
		
		
		for(int i=0; i<l.size(); i++) {
			
			System.out.println(l.get(i).getText());
		}
		
	}

}
