package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class disableautomationmsgonscreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.opencart.com/index.php?route=cms/feature");
		System.out.println(driver.getTitle());

	}

}
