package com.SeleniumPractice;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//selecting single option
		
		//driver.findElement(By.xpath("//input[@type='checkbox' and @value ='Java']")).click();
		
		//selecting multiple options
		
		
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]/li/a/label"));
		
		/*for(WebElement op : options) {
			
			if(op.getText().equals("Java") || op.getText().equals("Python") || op.getText().equals("MySQL")) {
				
				op.click();
			}
			

		}*/
		
		for(int i=0; i<options.size(); i++) {
			
			if(options.get(i).getText().equals("Java") || options.get(i).getText().equals("Python") || options.get(i).getText().equalsIgnoreCase("MYSQL")) {
				
				options.get(i).click();
			}
		}

	}

}
