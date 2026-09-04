package test_dataprovider;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class saucedemo_login_logout {
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws InterruptedException {
	  EdgeDriver driver;
	  
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();	
			driver.close();
		}
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "locked_out_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },
      new Object[] { "performance_glitch_use", "secret_sauce" },
      new Object[] { "error_user", "secret_sauce" },
      new Object[] { "visual_user", "secret_sauce" },
    };
  }
}
