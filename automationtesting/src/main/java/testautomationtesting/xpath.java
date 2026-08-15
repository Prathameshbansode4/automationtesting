package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpath {
	public static void main(String[] args) {
		xpath c = new xpath();
		c.positive();
	}
	void positive() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//1 find xpath using attribute   //tagname[@attribute='value']username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password123");
		
		//2 traverse    //parenttagname/childtagname
		//driver.findElement(By.xpath("//label/input")).sendKeys("Password123");
		
		//3 tagname   //tagname
		//driver.findElement(By.xpath("//input")).sendKeys("Password123");
		
		//4 by using text  //tagname[text() ='value']
		//driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("Password123");
		
		//5 by using contains   //tagname[contains(@attribute, 'value')]
		//driver.findElement(By.xpath("//button[contains(@class, 'btn')]"));
		
	}
}
