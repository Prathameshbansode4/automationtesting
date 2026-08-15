package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardaction {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("pratham");
		firstname.sendKeys(Keys.CONTROL+"A");//select
		firstname.sendKeys(Keys.CONTROL+"C");//copy
		
		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys(Keys.CONTROL+"V");//paste
		
	}
	
}
