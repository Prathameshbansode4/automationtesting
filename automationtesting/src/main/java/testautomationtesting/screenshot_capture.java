package testautomationtesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class screenshot_capture {
	static ChromeDriver driver;
	public static void main(String[] args) throws IOException {
		screenshot_capture s=new screenshot_capture();
		s.fulls();
		s.partial_ss();
	}

	static void fulls() throws IOException {
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
//		TakesScreenshot ts=driver;
//		
//		File src=ts.getScreenshotAs(OutputType.FILE);//ss captured
//		
//		File dest = new File("C:\\Users\\PRATHAM\\Downloads\\myntra_homepage.png");
//		
//		Files.copy(src, dest);
//		
//		System.out.println("Screenshot captured successfully!");
	}
	static void partial_ss() throws IOException {
		driver.navigate().to("https://www.fortunecloudindia.com/");
		WebElement fctlogo=driver.findElement(By.xpath("//img[@alt='FCT Logo - Fortune Cloud Technologies']"));
		
		File source = fctlogo.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\PRATHAM\\eclipse-workspa\\automationtesting\\fctlogo.png");
		
		Files.copy(source,destination);
		System.out.println("Partial ss captured");
	}
	
}
