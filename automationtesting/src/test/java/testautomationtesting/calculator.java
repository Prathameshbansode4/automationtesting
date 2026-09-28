package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class calculator {
	
	ChromeDriver driver=new ChromeDriver();
	
	@BeforeTest
	void launch() {
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
	}
	@Test(priority=1)
	void add() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	void sub() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='9']")).click();
		driver.findElement(By.xpath("//span[text()='–']")).click();
		driver.findElement(By.xpath("//span[text()='7']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	void multiply() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='8']")).click();
		driver.findElement(By.xpath("//span[text()='×']")).click();
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	void div() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//span[text()='/']")).click();
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
	}
}
