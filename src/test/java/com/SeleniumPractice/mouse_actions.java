package com.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouse_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*driver.get("https://demo-opencart.com/");
		
		driver.manage().window().maximize();
		
		//Mouse Hover
		WebElement d = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement m = driver.findElement(By.xpath("//a[normalize-space()='Mac (0)']"));
		Actions act = new Actions(driver);
		//act.moveToElement(d).moveToElement(m).click().build().perform();
		//or
		act.moveToElement(d).moveToElement(m).click().build().perform();*/
		
		//Right Click
		/*driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement r = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		Actions action = new Actions(driver);
		action.contextClick(r).perform();
		driver.findElement(By.xpath("//li[normalize-space()='Copy']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();*/
		
		//Double Click
		/*driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement db = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Actions actio = new Actions(driver);
		actio.doubleClick(db).perform();*/
		
		//drag and drop
		/*driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.id("box6"));
		WebElement trgt = driver.findElement(By.id("box106"));
		Actions a = new Actions(driver);
		a.dragAndDrop(src, trgt).perform();*/
		
		//Actions vs Action
		/*driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement w = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		Actions a1 = new Actions(driver);
		Action myaction = a1.contextClick(w).build();//Action interface will store the action and we can perform it later
		myaction.perform(); //here we r performing*/
		
		
		
	
		
		
	}

}
