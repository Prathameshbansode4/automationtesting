package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleframe {
	public static void main(String[] args) {
		singleframe();
	}
	


static void singleframe() {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Frames.html");
	//using id
	//driver.switchTo().frame("singleframe");
	
	//using index
	//driver.switchTo().frame(1);
	
	//using name
	//driver.switchTo().frame("SingleFrame");
	
	//tagname
	WebElement f=driver.findElement(By.tagName("iframe"));
	driver.switchTo().frame(f);
	driver.findElement(By.tagName("input")).sendKeys("pratham");
	
}
}