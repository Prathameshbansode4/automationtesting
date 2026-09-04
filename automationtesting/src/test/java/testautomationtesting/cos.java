package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cos {
ChromeDriver driver=new ChromeDriver();
	
	@Test
	void launch() {
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
	}
		
		   // cos(0)
	@Test(dependsOnMethods = "launch")
	void cos0() {
		driver.findElement(By.xpath("//span[text()='cos']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}
	
//	   // cos(30)
//	@Test(dependsOnMethods = "launch")
//	void cos30() {
//		driver.findElement(By.xpath("//span[text()='cos']")).click();
//		driver.findElement(By.xpath("//span[text()='30']")).click();
//		driver.findElement(By.xpath("//span[text()='=']")).click();
//	}
//	
//	   // cos(45)
//	@Test(dependsOnMethods = "launch")
//	void cos45() {
//		driver.findElement(By.xpath("//span[text()='cos']")).click();
//		driver.findElement(By.xpath("//span[text()='45']")).click();
//		driver.findElement(By.xpath("//span[text()='=']")).click();
//	}
//	
//	   // cos(60)
//	@Test(dependsOnMethods = "launch")
//	void cos60() {
//		driver.findElement(By.xpath("//span[text()='cos']")).click();
//		driver.findElement(By.xpath("//span[text()='60']")).click();
//		driver.findElement(By.xpath("//span[text()='=']")).click();
//	}
//	
//	   // cos(90)
//	@Test(dependsOnMethods = "launch")
//	void cos90() {
//		driver.findElement(By.xpath("//span[text()='cos']")).click();
//		driver.findElement(By.xpath("//span[text()='90']")).click();
//		driver.findElement(By.xpath("//span[text()='=']")).click();
//	}
//	
}
