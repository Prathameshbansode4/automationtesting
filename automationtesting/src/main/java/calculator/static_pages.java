package calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class static_pages {
public static void main(String[] args) {
	static_pages s=new static_pages();
	s.info();
}
void info() {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.calculator.net/");
	//driver.findElement(By.xpath("//a[text()='about us']")).click();
	//driver.findElement(By.xpath("//a[text()='sitemap']")).click();
	//driver.findElement(By.xpath("//a[text()='terms of use']")).click();
	driver.findElement(By.xpath("//a[text()='privacy policy']")).click();
	driver.navigate().back();
	}
}
