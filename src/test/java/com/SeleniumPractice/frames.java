package com.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ui.vision/demo/webtest/frames/");

		driver.manage().window().maximize();

		// Frame1
		WebElement l = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(l);

		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("karthik");

		driver.switchTo().defaultContent();

		// Frame2
		WebElement l1 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));

		driver.switchTo().frame(l1);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("welcome");

		driver.switchTo().defaultContent();

		// Frame3
		WebElement l2 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));

		driver.switchTo().frame(l2);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Hello");

		// iframe - present inside frame3

//WebElement l3 = driver.findElement(By.xpath("//iframe[@width='650']"));

		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("div.AB7Lab")).click();

	}

}
