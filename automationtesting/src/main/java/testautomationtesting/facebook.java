package testautomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class facebook {
	public static void main(String[] args) {
		facebook p=new facebook();
		p.invalidtest(); 
		
	}
	void invalidtest()
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://secure.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pratham@gmail.com");//id
		driver.findElement(By.name("pass")).sendKeys("pratham@12");//name
		driver.findElement(By.tagName("button")).click();//tagname
		driver.findElement(By.linkText("Forgotten password?")).click();//linktext
		driver.navigate().back();//to navigate back
		driver.findElement(By.partialLinkText("Forgotten")).click();//partiallinktext
		driver.navigate().back();
		//classname
		driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
	}

}
