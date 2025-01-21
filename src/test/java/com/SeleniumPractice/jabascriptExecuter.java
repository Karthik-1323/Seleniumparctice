package com.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jabascriptExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		/*driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("name"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Alternative of sendkeys method
		js.executeScript("arguments[0].setAttribute('value', 'KKPK')", ele);
		
		//Alternative of click method
		WebElement element = driver.findElement(By.id("male"));
		js.executeScript("arguments[0].click()", element);*/
		
		//Scrolling the page
		//1. Scroll by pixel number
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,2000)", "");
		
		//Scroll the page till the element is displayed
		//WebElement e = driver.findElement(By.xpath("//h2[normalize-space()='Dynamic Web Table']"));
		//js.executeAsyncScript("arguments[0].scrollIntoView()", e);
		
		//Scroll page till the end
		/*js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Scroll page to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));*/
		
		//Zoom the webpage
		js.executeScript("document.body.style.zoom='20%'");
		
		

	}

}
