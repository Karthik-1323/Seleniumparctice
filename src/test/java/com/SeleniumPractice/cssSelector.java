package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//options in cssselectors:
		//tag id - tag#id
		 //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("jhsgs");
		//tag classname - tag.classname
		 //driver.findElement(By.cssSelector("a.ico-register")).click();
		//tag attribute - tag[attribute="value"]
		 //driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("lkui");
		//tag class attribute - tag.class[attribute="value"]
         //driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("karthik");
		
		
		

	}

}
