package com.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		//single file upload
		driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Users\\admin\\Downloads\\srk.jfif");
		
		//multiple files upload
		String f1 = "C:\\Users\\admin\\Downloads\\Post Page.txt";
		String f2 = "C:\\Users\\admin\\Downloads\\LoginPageFB.txt";
		
		driver.findElement(By.id("filesToUpload")).sendKeys(f1 +"\n"+f2);
	}

}
