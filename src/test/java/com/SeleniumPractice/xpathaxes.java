package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/feature");
		//X path using ancestor
		//driver.findElement(By.xpath("//a[text()='Download']/ancestor::div"));
		//X path using parent
		//driver.findElement(By.xpath("//a[text()='Download']/parent::ul"));
		//X path using following
		//driver.findElement(By.xpath("//a[text()='Blog']/following::a")).click();
		//X path using preceding
		//driver.findElement(By.xpath("//a[text()='Download']/preceding::a[1]")).click();
		//X path using descendant
		//driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']/descendant::li[4]/a")).click();
        // X path using child
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/child::li[4]/a")).click();
	}

}
