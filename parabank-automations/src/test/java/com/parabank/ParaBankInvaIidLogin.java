package com.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ParaBankInvaIidLogin {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabankv2/index.htm");
		driver.findElement(By.className("input")).sendKeys("ppp");
		driver.findElement(By.name("password")).sendKeys("p@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
}
