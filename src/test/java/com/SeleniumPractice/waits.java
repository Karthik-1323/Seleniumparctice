package com.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       
       //Explicit wait
       
       WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5000));
       
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); // Implictwait
       
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
       driver.manage().window().maximize();
       
       //Thread.sleep(3000); //(using this is not a good practice)
       
       WebElement pswd = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='oxd-input oxd-input--active']")));
       pswd.sendKeys("hgytr");
       
       //driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("okayy");
	}

}
