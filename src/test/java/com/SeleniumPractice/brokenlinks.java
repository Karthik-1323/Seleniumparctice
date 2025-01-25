package com.SeleniumPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link: links) {
			
			String hrefvalue = link.getAttribute("href");
			if(hrefvalue == null || hrefvalue.isEmpty()) {
				
				System.out.println("href value is empty so not possible to check");
				continue;
			}
			
			try {
				
				URL linkurl = new URL(hrefvalue); // converted href value from string to url
				HttpURLConnection con = (HttpURLConnection) linkurl.openConnection(); //opens connection request to the server
				con.connect(); //opens connection and sends request to server
				
				if (con.getResponseCode()>=400)
				{
					System.out.println(hrefvalue + "broken link");
				}
				else {
					
					System.out.println(hrefvalue + "Not broken link");
					
				}
				
			}
			catch(Exception e) {
		}
		
		
	}

}
}
