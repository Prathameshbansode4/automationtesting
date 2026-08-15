package cross_browser_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_b {

	void test_case1() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		String Expected_url="https://practicetestautomation.com/practice-test-login/";
		String Actual_url=driver.getCurrentUrl();
		if(Expected_url.equals(Actual_url)) {
			System.out.println("positive test case passed!!");
		}
		else {
			System.out.println("positive test case failed");
		}
	}
}
