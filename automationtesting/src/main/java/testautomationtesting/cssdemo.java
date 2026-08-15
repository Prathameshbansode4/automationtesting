package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssdemo {
	public static void main(String[] args) {
		cssdemo v = new cssdemo();
		v.automat();
	}
	void automat() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("pratham");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("bansode");
		driver.findElement(By.cssSelector("textarea[rows='3']")).sendKeys("Bhosari");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("pratham@123");
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input[type='radio']")).click();
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	}
}
