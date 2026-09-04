package testautomationtesting;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Test;

public class swaglabs {

	EdgeDriver driver;
	@Test
	void launch() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();	
	}
}
