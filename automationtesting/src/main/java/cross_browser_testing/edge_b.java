package cross_browser_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class edge_b {
	void testcas2() {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		WebElement errormsg=driver.findElement(By.id("error"));
		
		String Expected_error="https://practicetestautomation.com/practice-test-login/";
		String Actual_error=driver.getCurrentUrl();
		if(Expected_error.equals(Actual_error)) {
			System.out.println("positive test case passed!!");
		}
		else {
			System.out.println("positive test case failed");
		}
	}
}
