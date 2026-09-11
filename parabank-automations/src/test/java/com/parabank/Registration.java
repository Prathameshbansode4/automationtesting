package com.parabank;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Registration {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabankv2/index.htm");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("customer.firstName")).sendKeys("Prathamesh");
		driver.findElement(By.id("customer.lastName")).sendKeys("Bansode");
		driver.findElement(By.id("customer.address.street")).sendKeys("chikhli");
		driver.findElement(By.id("customer.address.city")).sendKeys("nigdi");
		driver.findElement(By.id("customer.address.state")).sendKeys("pune");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("411062");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567890");
		driver.findElement(By.id("customer.ssn")).sendKeys("4567890");
		
		
		driver.findElement(By.id("customer.username")).sendKeys("prathamesh");
		driver.findElement(By.id("customer.password")).sendKeys("prathamesh@123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("prathamesh@123");
		driver.findElement(By.className("button")).click();
	}
}
