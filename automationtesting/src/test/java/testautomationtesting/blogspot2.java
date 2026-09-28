package testautomationtesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class blogspot2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriver wait;
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.findElement(By.id("alertBtn")).click();
//		Thread.sleep(2000);
//		Alert alert =driver.switchTo().alert();
//		alert.accept();
		
//		driver.findElement(By.id("confirmBtn")).click();
//		Thread.sleep(1000);
//		Alert alert =driver.switchTo().alert();
//		alert.dismiss();
		
//		driver.findElement(By.id("promptBtn")).click();
//		Thread.sleep(2000);
//		Alert alert =driver.switchTo().alert();
//		alert.sendKeys("hello world");
//		Thread.sleep(1000);
//		alert.accept();
		
//		driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
		
		//mousehover
//		WebElement dropbtn=driver.findElement(By.className("dropbtn"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(dropbtn).perform();
		
//		WebElement button=driver.findElement(By.cssSelector("button[ondblclick='myFunction1()']"));
//		Thread.sleep(1000);
//		Actions actions=new Actions(driver);
//		actions.doubleClick(button).perform();
		
		
//		DRAG AND DROP
//		WebElement source=driver.findElement(By.id("draggable"));
//		WebElement destinatination=driver.findElement(By.id("droppable"));
//		Actions actions=new Actions(driver);
//		actions.dragAndDrop(source, destinatination).perform();
		
		WebElement slider = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-slider-handle ui-corner-all ui-state-default")));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(slider, 100, 0).perform();
	}
}
