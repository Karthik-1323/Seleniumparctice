package com.SeleniumPractice;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
//Types of get() Methods
		//get(url) - open the url
		//driver.get("https://www.opencart.com/index.php?route=common/home");
		  driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		  driver.manage().window().maximize();
		
		//getTitle() - returns title of the page
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//getCurrentURL() - returns url of current page
		//driver.findElement(By.linkText("Marketplace")).click();
		//String cURL = driver.getCurrentUrl();
		//System.out.println(cURL);
		
		//getPageSource() - returns source code of the page
		//String pgSrc = driver.getPageSource();
		//System.out.println(pgSrc);
		
		//getWindowHandle() - returns the id of single browser window
		//String id = driver.getWindowHandle();
		//System.out.print(id);
		
		//getWindowHanles() - returns the id's of multiple browser windows
		//driver.findElement(By.linkText("Facebook")).click();
		//Set <String> l   = driver.getWindowHandles();
		//System.out.println(l);

//Types of conditional methods:(returns boolean- true/false)
		//isDisplayed() - element is displayed or not
		  //boolean b = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		  //System.out.println(b);
		
		//isEnabled() - check whether element is in enabled or disabled status
		  //boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		  //System.out.print(status);
		  
		//isSelected() - Check whether the element is selected or not
		  //boolean s = driver.findElement(By.xpath("//input[@value='M']")).isSelected(); //false
		  //WebElement s = driver.findElement(By.xpath("//input[@value='F']"));
		  //s.click();
		  //boolean p=  s.isSelected();
		  //System.out.print(p); //true
//Types of browser methods:
		 //close() - closes a single window
		   //driver.close();
		  
		 //quit() - closes all/multipe windows at a time
		   //driver.quit();
		}

}
