package com.SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicwebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.ecomdeveloper.com/demo/admin/index.php?route=common/login");

		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//input[@id='input-username']"));
		ele.clear();
		ele.sendKeys("demoadmin");

		WebElement el = driver.findElement(By.xpath("//input[@id='input-password']"));
		el.clear();
		el.sendKeys("demopass");

		driver.findElement(By.className("btn-primary")).click();

		// driver.switchTo().alert().accept();

		WebElement drpd = driver.findElement(By.xpath("//li[@id='menu-customer']/a"));

		// Select drp = new Select(drpd);

		drpd.click();

		driver.findElement(By.xpath("//li[@id='menu-customer']/ul//a")).click();

		// clicking on total pages
		String s = driver.findElement(By.xpath("//div[@class = 'col-sm-6 text-right']")).getText();

		int totalpages = Integer.parseInt(s.substring(s.indexOf("(") + 1, s.indexOf("Pages") - 1));

		for (int i = 1; i <= totalpages; i++) {

			if (i > 1) {

				driver.findElement(By.xpath("//a[text() ='" + i + "']")).click();

				// System.out.println(i);

				// Total row size in each page

				/*
				 * List<WebElement> l = driver.findElements(By.
				 * xpath("//table[@class='table table-bordered table-hover']//tr"));
				 * 
				 * System.out.println(l.size());
				 */

				// read data from table

				int norows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tr"))
						.size();

				for (int j = 1; j < norows; j++) {

					String s1 = driver
							.findElement(By.xpath(
									"//table[@class='table table-bordered table-hover']//tbody/tr[" + j + "]/td[2]"))
							.getText();
					String str = driver
							.findElement(By.xpath(
									"//table[@class='table table-bordered table-hover']//tbody/tr[" + j + "]/td[3]"))
							.getText();
					System.out.println(s1 + " " + str);
				}

			}
		}

	}
}
