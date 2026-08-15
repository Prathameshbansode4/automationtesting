package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {
	public static void main(String[] args) {
		demo t= new demo();
		t.test();
	}
	void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@Type='text']")).sendKeys("pratham");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("bansode");
		driver.findElement(By.xpath("//textarea")).sendKeys("bhosari");
		driver.findElement(By.xpath("//input[@Type='email']")).sendKeys("pratham@123");
		driver.findElement(By.xpath("//input[@Type='tel']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[contains(@type,'radio')]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
//		driver.findElement(By.id("msdd")).click();
//		driver.findElement(By.xpath("//a[text()='English']")).click();

		
		
		// Skills
		WebElement skills = driver.findElement(By.id("Skills"));
		Select skill = new Select(skills);
		skill.selectByVisibleText("Java");

		// Select Country
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India");
		driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();

		// Year
		Select yr = new Select(driver.findElement(By.id("yearbox")));
		yr.selectByVisibleText("2003");

		// Month
		Select mon = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		mon.selectByVisibleText("September");

		// Day
		Select day = new Select(driver.findElement(By.id("daybox")));
		day.selectByVisibleText("1");

		// Password
		driver.findElement(By.id("firstpassword")).sendKeys("Password@123");

		// Confirm Password
		driver.findElement(By.id("secondpassword")).sendKeys("Password@123");
	}
}
