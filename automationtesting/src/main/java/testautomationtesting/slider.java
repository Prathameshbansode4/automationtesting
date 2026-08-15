package testautomationtesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class slider {
	WebDriver driver;
	Actions ac;
	public static void main(String[] args) {
		slider s=new slider() ;
		s.slider();
	}
	void slider() {
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'dropdown-menu')]//a[contains(text(),'Alerts')]")).click();
		
	}
	
}
