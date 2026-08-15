package testautomationtesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandle {
	
	public static void main(String[] args) {
		
		dropdownhandle v= new dropdownhandle();
		v.testdropdown();
	}
	void testdropdown() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("pratham");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pratham@123");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//textarea")).sendKeys("nigdi");
		driver.findElement(By.xpath("//label[contains(@class, 'form-check-label')]")).click();
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//selecting value by index
		WebElement Country = driver.findElement(By.id("country"));	
		Select sel = new Select(Country);
		sel.selectByIndex(9);
		
				// selecting value by value
		WebElement colors = driver.findElement(By.id("colors"));
		Select s = new Select(colors);
		s.selectByValue("green");
		
		WebElement animals = driver.findElement(By.id("animals"));
		Select l = new Select(animals);
		l.selectByVisibleText("Cat");
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("9/1/2003");		///driver.findElement(By.xpath("//input[@id='txtDate']")).sendKeys("08/06/2026");   If it has readonly, sendKeys() won't work directly.
		
		driver.findElement(By.xpath("//input[@id='start-date']")).sendKeys("01/09/2003");
		driver.findElement(By.xpath("//input[@id='end-date']")).sendKeys("06/08/2026");
		driver.findElement(By.id("name")).click();

		
		driver.findElement(By.xpath("//button[contains(@class,'submit-btn')]")).click();		
		
		
	}
	
}
