package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class practiceform {

	ChromeDriver driver;
	@BeforeClass
	void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	@Test(priority=0)
	void personalDetail() {
		driver.findElement(By.id("firstName")).sendKeys("pratham");
		driver.findElement(By.id("lastName")).sendKeys("bansode");
		driver.findElement(By.id("userEmail")).sendKeys("bansode@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9876543210");
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("18 Aug 2026");
	}
}