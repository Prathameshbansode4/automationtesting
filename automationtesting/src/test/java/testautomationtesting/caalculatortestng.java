package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class caalculatortestng {
ChromeDriver driver=new ChromeDriver();
	
	@BeforeMethod
	void openCalculator() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		Thread.sleep(1000);
	}
		
		   // sin(0)
	@Test(priority=0)
	void sin0() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='sin']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(1000);
	}
	
	   // sin(30)
	@Test(priority=1)
	void sin30() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='sin']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		Thread.sleep(1000);
	}
	
	   // sin(45)
	@Test(priority=2)
	void sin45() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='sin']")).click();
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		Thread.sleep(1000);
	}
	
	   // sin(60)
	@Test(priority=3)
	void sin60() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='sin']")).click();
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		Thread.sleep(1000);
	}
	
	   // sin(90)
	@Test(priority=4)
	void sin90() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='sin']")).click();
		driver.findElement(By.xpath("//span[text()='9']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		Thread.sleep(1000);
	}
	
}
