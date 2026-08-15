package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	WebDriver driver;
	Actions ac;
	public static void main(String[] args) {
		dropdown p=new dropdown();
		p.testdropdown();
		p.dragndrop();
		p.slider();
	}
	void testdropdown() {
	    driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement pointme=driver.findElement(By.xpath("//button[text()='Point Me']"));
		
		ac = new Actions(driver);
		ac.moveToElement(pointme).build().perform();
		

	}
	void dragndrop() {
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();
	}
	void slider() {
		WebElement slid=driver.findElement(By.xpath("//span[@style='left: 15%;']"));
		ac.dragAndDropBy(slid, 100, 0).build().perform();
		
		WebElement sli=driver.findElement(By.xpath("//span[@style='left: 60%;']"));
		ac.dragAndDropBy(sli, 50, 0).build().perform();
	}
}
