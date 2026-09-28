package testautomationtesting;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.*;


public class demoqa2 {
	ChromeDriver driver;
    WebDriverWait wait;

	@Test
	void da() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("pratham");
		driver.findElement(By.id("lastName")).sendKeys("bansode");
		driver.findElement(By.id("userEmail")).sendKeys("bansode@gmail.com");
		driver.findElement(By.id("gender-radio-1")).click();
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		
		WebElement dob=driver.findElement(By.id("dateOfBirthInput"));
		dob.click();
		//driver.findElement(By.className("react-datepicker__year-select")).click();
		//year
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select select = new Select(year);
		select.selectByValue("2003");
		
		//month
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		select = new Select(month);
		select.selectByVisibleText("September");
		
		WebElement date = driver.findElement(By.cssSelector(".react-datepicker__day--001:not(.react-datepicker__day--outside-month)"));
		date.click();
		
		WebElement subject=driver.findElement(By.id("subjectsInput"));
		subject.sendKeys("computer science");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".subjects-auto-complete__option"))).click();
		
		driver.findElement(By.id("hobbies-checkbox-1")).click();
		
		WebElement upload=driver.findElement(By.id("uploadPicture"));
		upload.sendKeys("C:\\Users\\PRATHAM\\git\\repository\\automationtesting\\fctlogo.png");
		
		driver.findElement(By.id("currentAddress")).sendKeys("ABC CHOWK PUNE");
		WebElement state = driver.findElement(By.id("state"));
		state.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='NCR']"))).click();
	}
	
		
	}

