package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoqa {

	ChromeDriver driver;
	@Test
	void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	@Test
	void reg() {
		driver.findElement(By.id("firstName")).sendKeys("pratham");
		driver.findElement(By.id("lastName")).sendKeys("pratham");

	}
}
