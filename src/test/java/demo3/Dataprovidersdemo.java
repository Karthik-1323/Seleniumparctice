package demo3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidersdemo {

	WebDriver driver;

	@BeforeClass
	
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "dp")
	void testlogin(String email, String pwd) {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
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

	@DataProvider(name = "dp")

	Object[][] logindata() {

		Object[][] data = { {"Budmin", "test@453"}, {"Cudmin", "test@493"}, {"Dudmin", "test@450"},
				{"Admin", "admin123"} };

		return data;
	}
}
