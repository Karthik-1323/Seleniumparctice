package com.SeleniumPractice;

import java.util.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlebrowserwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		Set<String> s = driver.getWindowHandles();

		List<String> windowids = new ArrayList(s);

		String parenthandle = windowids.get(0);
		String child = windowids.get(1);

//String ct = driver.switchTo().window(child).getTitle();

		String pt = driver.getTitle();
		System.out.println(pt);

	}

}
