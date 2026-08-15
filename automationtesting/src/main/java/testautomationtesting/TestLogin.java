package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	public static void main(String[] args) {
		TestLogin a=new TestLogin();
		a.login();
	}
	
	void login(){
	WebDriver driver = new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
//	driver.findElement(By.id("username")).sendKeys("student");
//	driver.findElement(By.name("password")).sendKeys("Password123");
//	driver.findElement(By.id("submit")).click();

	
	
//	negative test
//	driver.findElement(By.id("username")).sendKeys("incorrectUser ");
//	driver.findElement(By.name("password")).sendKeys("Password123");
//	driver.findElement(By.id("submit")).click();
	
	
//	negative test
//	driver.findElement(By.id("username")).sendKeys("student");
//	driver.findElement(By.name("password")).sendKeys("incorrectPassword ");
//	driver.findElement(By.id("submit")).click();
	}
}


