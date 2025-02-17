package mylistener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class orangehrm {
	
	WebDriver driver;

	@BeforeClass
	
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1)
	void opensite() {

		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("kk@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Form_submitForm_action_request']")).click();
		
}
	@Test(priority = 2, dependsOnMethods = {"opensite"})
	void validation() {
		
		boolean s = driver.findElement(By.xpath("//img[@alt='OrangeHRM Logo']")).isDisplayed();
		Assert.assertEquals(s, true);
	}
	
	@Test(priority = 3, dependsOnMethods = {"validation"})
	void titlevalidation() {
		
		String t = driver.getTitle();
		System.out.println(t);
		Assert.assertEquals(t, "OrangeHRM");
	}

	@AfterClass
	void teardown() {
		driver.close();
	}

}
