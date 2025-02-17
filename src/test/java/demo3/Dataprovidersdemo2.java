package demo3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprovidersdemo2 {

	WebDriver driver;

	@BeforeClass
	@Parameters({"browser"})

	void setup(String br) {
		
		switch(br.toLowerCase())
		{
		case "chrome": driver = new ChromeDriver();break;
		case "edge": driver = new EdgeDriver();break;
		default: System.out.println("invalidbrowser");return;
		
		
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	void testlogin() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// driver.switchTo().alert().accept();

		boolean status = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();

		if (status == true) {

			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();

			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail();

		}
	}

	@AfterClass
	void teardown() {
		driver.close();
	}

}
