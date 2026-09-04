package calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class search {
	public static void main(String[] args) throws InterruptedException {
		search s=new search();
		s.mousehover();
	}
	void mousehover() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.findElement(By.id("calcSearchTerm")).sendKeys("math calculator");
		Thread.sleep(1000);
		WebElement mathcalculator=driver.findElement(By.xpath("//a[text()='Math Calculators']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(mathcalculator).perform();
		
		Thread.sleep(2000);
		
	}
}
