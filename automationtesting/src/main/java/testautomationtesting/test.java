package testautomationtesting;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
public class test {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//configuration of webdriver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\PRATHAM\\eclipse-workspa\\automationtesting\\driverresources\\msedgedriver.exe");
		
		//browser launch
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();   //maximize screen
		
//		
//		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.39.0"); //launch web
//		System.out.println("Title of mvn is:"+driver.getTitle());
//		Thread.sleep(1000);
//		driver.navigate().to("https://chatgpt.com/"); //to navigate another website
//		System.out.println("url of chatgpt is:"+driver.getCurrentUrl());
//		Thread.sleep(1000);
//		driver.navigate().back();//to back the first page
//		Thread.sleep(1000);
//		driver.navigate().forward();//again forward to next page
//		Thread.sleep(1000);
//		driver.close();//to close the page
//		
		
		//test scenario=verify instagram title is "instagram user"
//		driver.get("https://www.instagram.com/");
//		
//		String expected_title="Instagram";
//		
//		String actual_title=driver.getTitle();
//		
//		if(expected_title.equals(actual_title)) {
//			System.out.println("Title is matching");
//		}else {
//			System.out.println("Title is not matching");
//		}
//		driver.close();
		
		
		//test scenario=verify the url of fb login page
//		
//		driver.get("https://www.facebook.com/");
//		
//		String expectedurl="www.facebook.com";
//		
//		String actualurl=driver.getCurrentUrl();
//		
//		if(expectedurl.equals(actualurl)) {
//			System.out.println("fb login page url is matching");
//		}else {
//			System.out.println("fb login page url is not matching");
//		}
//		driver.close();
		
		
	}

}
