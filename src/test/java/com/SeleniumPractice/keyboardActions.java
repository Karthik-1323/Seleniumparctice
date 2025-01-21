package com.SeleniumPractice;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Sliding
		/*driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		WebElement min_slider = driver.findElement(By.xpath("//span[@style='left: 0%;']"));
		System.out.println(min_slider.getLocation());//(59, 293)
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 293).perform();
		
		WebElement max_slider = driver.findElement(By.xpath("//span[@style='left: 100%;']"));
		System.out.println(max_slider.getLocation());//(150, 293)
		act.dragAndDropBy(max_slider, -162, 293).perform();*/
		
		//keyboard actions(ctrl+c,ctrl+v,tab..etc)
		/*driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to new");
		Actions a = new Actions(driver);
		//ctrl+A
		a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		//ctrl+C
		a.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		//Tab
		a.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		//ctrl+V
		a.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();*/
		
		//opening new tabs and windows
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//a[@class='ico-register']"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(e).keyUp(Keys.CONTROL).perform();
		//switching to reg handle
		Set<String> s = driver.getWindowHandles();
		List<String> li = new ArrayList(s);
		driver.switchTo().window(li.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Karthik K");
		
		
		
		

	}

}
