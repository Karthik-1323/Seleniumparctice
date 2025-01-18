package com.SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticwebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		// total rows in a table
		List<WebElement> l = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println(l.size());

		// total coloumns in a table
		List<WebElement> l1 = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		System.out.println(l1.size());

		// Read data from specific row and coloumn
		// WebElement s =
		// driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]"));
		// System.out.println(s.getText());

		// Read all data from the table
		/*for (int i = 2; i <= l.size(); i++) {

			for (int j = 1; j <= l1.size(); j++) {

				String st = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(st+" ");
			}
			System.out.println();*/
		
		//Get total price of table
		
		int sum =0;
		for(int i=2; i<=l.size(); i++) {
			
			
			
			String st1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td[4]")).getText();
			
			System.out.println(st1);
			
			sum = sum+Integer.parseInt(st1);
		}
		
		System.out.println(sum);
		

	}

}
