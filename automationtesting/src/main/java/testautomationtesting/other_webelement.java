package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class other_webelement {
	ChromeDriver driver;
	
	void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	void dynamicbutton() {
		driver.findElement(By.name("start")).click();
	}
	void search() {
		WebElement se=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		se.sendKeys("mobile");
		se.sendKeys(Keys.ENTER);
	}
	void doubleclick() {
		WebElement dblclick=driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		Actions ac=new Actions(driver);
		ac.doubleClick(dblclick).perform();
	}
//	void newtab() {
//		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
//	}
	
	public static void main(String[] args) {
		other_webelement o=new other_webelement();
		o.setup();
		o.dynamicbutton();
		o.search();
		//o.newtab();
		o.doubleclick();
	}
}
