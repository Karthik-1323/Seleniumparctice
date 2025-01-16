package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		String title = driver.getTitle();
		
		
		driver.close();
		
		if(title.equalsIgnoreCase("YouTube")) {
			
			System.out.println("testpassed");
		}
		else {
			
			System.out.println("Testfaied");
		}
		
		
	}

}
