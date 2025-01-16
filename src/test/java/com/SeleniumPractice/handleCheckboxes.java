package com.SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// Select Specific checkboxes
 
		// driver.findElement(By.xpath("//input[@id='saturday']")).click();

		// select multiple checkboxes

		List<WebElement> l = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*
		 * for(int i=0; i<l.size(); i++) {
		 * 
		 * l.get(i).click(); }
		 */

		for (int i = l.size() - 1; i >= (l.size() - (l.size() - 4)); i--) {

			l.get(i).click();

		}

		for (int i = l.size() - 1; i >= (l.size() - (l.size() - 4)); i--) {

			if (l.get(i).isSelected()) {

				l.get(i).click();

			}
		}

	}

}
