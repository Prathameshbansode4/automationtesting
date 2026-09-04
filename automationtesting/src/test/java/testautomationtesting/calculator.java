package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calculator {
	
	ChromeDriver driver=new ChromeDriver();
	
	@Test
	void launch() {
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
	}
//	@Test(dependsOnMethods = "launch")
//	void add() {
//		driver.findElement(By.xpath("//span[text()='1']")).click();
//		driver.findElement(By.xpath("//span[text()='+']")).click();
//		driver.findElement(By.xpath("//span[text()='3']")).click();
//	}
	
//	@Test(dependsOnMethods = "launch")
//	void sub() {
//		driver.findElement(By.xpath("//span[text()='9']")).click();
//		driver.findElement(By.xpath("//span[text()='–']")).click();
//		driver.findElement(By.xpath("//span[text()='7']")).click();
//	}
	
//	@Test(dependsOnMethods = "launch")
//	void multiply() {
//		driver.findElement(By.xpath("//span[text()='8']")).click();
//		driver.findElement(By.xpath("//span[text()='×']")).click();
//		driver.findElement(By.xpath("//span[text()='6']")).click();
//	}
	
	@Test(dependsOnMethods = "launch")
	void div() {
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//span[text()='/']")).click();
		driver.findElement(By.xpath("//span[text()='6']")).click();
	}
}
