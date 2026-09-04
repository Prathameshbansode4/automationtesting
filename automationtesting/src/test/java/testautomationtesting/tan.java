package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tan {
ChromeDriver driver=new ChromeDriver();
	
	@Test(priority=0)
	void launch() {
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
	}
		
		   // sin(0)
	@Test(priority=1)
	void tan0() {
		driver.findElement(By.xpath("//span[text()='tan']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}
	
//	   // sin(30)
//	@Test(priority=2)
//	void tan30() {
//		driver.findElement(By.xpath("//span[text()='tan']")).click();
//		driver.findElement(By.xpath("//span[text()='30']")).click();
//		driver.findElement(By.xpath("//span[text()='=']")).click();
//	}
//	
//	   // sin(45)
//	@Test(priority=3)
//	void tan45() {
//		driver.findElement(By.xpath("//span[text()='tan']")).click();
//		driver.findElement(By.xpath("//span[text()='45']")).click();
//		driver.findElement(By.xpath("//span[text()='=']")).click();
//	}
//	
//	   // sin(60)
//	@Test(priority=4)
//	void tan60() {
//		driver.findElement(By.xpath("//span[text()='tan']")).click();
//		driver.findElement(By.xpath("//span[text()='60']")).click();
//		driver.findElement(By.xpath("//span[text()='=']")).click();
//	}
//	
//	   // sin(90)
//	@Test(priority=5)
//	void tan90() {
//		driver.findElement(By.xpath("//span[text()='tan']")).click();
//		driver.findElement(By.xpath("//span[text()='90']")).click();
//		driver.findElement(By.xpath("//span[text()='=']")).click();
//	}
//	
}
