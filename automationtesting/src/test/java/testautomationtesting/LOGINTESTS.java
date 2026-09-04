package testautomationtesting;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Listeners(Testlistener.class)
public class LOGINTESTS extends Basetest {
	
	
    @Test
    public void FailedTc() {

        System.out.println("Executing Login Test");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nava")));

        // Intentionally fail the test
        String Actual_title=driver.getTitle();
        String Expected_title="123";
        Assert.assertEquals(Actual_title,Expected_title);
    }
	

    @Test(dependsOnMethods = "FailedTc")
    public void loginTest() {

        System.out.println("Executing Login Test");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nava")));

        // Intentionally fail the test
        String Actual_title=driver.getTitle();
        String Expected_title="STORE";
        Assert.assertEquals(Actual_title,Expected_title);
    }
}
