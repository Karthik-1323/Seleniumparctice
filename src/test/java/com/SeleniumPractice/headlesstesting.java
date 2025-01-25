package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlesstesting {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
				
				WebDriver driver = new ChromeDriver(options);
				
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


