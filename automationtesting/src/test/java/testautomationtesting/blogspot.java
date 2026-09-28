package testautomationtesting;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class blogspot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("pratham");
		driver.findElement(By.id("email")).sendKeys("pratham@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.id("textarea")).sendKeys("nigdi");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("monday")).click();
		WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.id("country")));
		country.click();
		WebElement india = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[normalize-space()='India']")));
		india.click();
		WebElement colour = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("colors")));
		Select select = new Select(colour);
		select.selectByVisibleText("Red");
		WebElement animal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("animals")));
		select = new Select(animal);
		select.selectByIndex(1);
		WebElement dob = wait.until(ExpectedConditions.elementToBeClickable(By.id("datepicker")));
		dob.click();
		WebElement year = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-year")));
		select = new Select(year);
		select.selectByVisibleText("2003");
		WebElement month = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-month")));
		select = new Select(month);
		select.selectByVisibleText("Sep");
		WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='1']")));
		date.click();
	}
}