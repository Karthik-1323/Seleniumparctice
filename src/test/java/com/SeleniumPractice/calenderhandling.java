package com.SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderhandling {

	static void selectfutureMonthandYearanddate(WebDriver driver, String s1, String s2, String s3) {

		while (true) {
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentmonth.equals(s1) && currentyear.equals(s2)) {
				break;

			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}

		List<WebElement> alldates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		for (int i = 0; i < alldates.size(); i++) {
			if (alldates.get(i).getText().equals(s3)) {
				alldates.get(i).click();
				break;
			}
		}
	}

	static void selectpastMonthandYearanddate(WebDriver driver, String s1, String s2, String s3) {

		while (true) {
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentmonth.equals(s1) && currentyear.equals(s2)) {
				break;

			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}

		List<WebElement> alldates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

		for (int i = 0; i < alldates.size(); i++) {

			if (alldates.get(i).getText().equals(s3)) {

				alldates.get(i).click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		String s1 = "December";
		String s2 = "2023";
		String s3 = "21";
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		// selectfutureMonthandYearanddate(driver,s1,s2,s3);
		selectpastMonthandYearanddate(driver, s1, s2, s3);

	}

}
