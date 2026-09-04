package calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) {
		login e=new login();
		e.userlogin();
	}
	void userlogin() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.findElement(By.xpath("//a[text()='sign in']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pratham@12gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prathamesh");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		System.out.println("Login successfully");

	}
}
