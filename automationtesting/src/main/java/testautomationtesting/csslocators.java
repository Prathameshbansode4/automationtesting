package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocators {
	public static void main(String[] args) {
		csslocators v = new csslocators();
		v.creative();
	}
	void creative() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//1. attribute    tagname[attribute='value']
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("student");
		
		//2.#idvalue
		driver.findElement(By.cssSelector("#password")).sendKeys("student@123");
		
		//3. tagname
//		driver.findElement(By.cssSelector("img")).click();
		
		//4.tagname.classname
		driver.findElement(By.cssSelector("button.btn")).click();
		
		//5. .classname.classvalue
	
	}
}
