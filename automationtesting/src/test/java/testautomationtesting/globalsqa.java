package testautomationtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class globalsqa {

    ChromeDriver driver;
    WebDriverWait wait;
    Actions actions;

    @Test
    void keyboardAndMouseActions() {

        
        driver = new ChromeDriver();

        
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       
        actions = new Actions(driver);
        driver.get("https://www.globalsqa.com/demo-site/");
        driver.manage().window().maximize();

        WebElement demoSite =driver.findElement(By.xpath("//a[text()='Demo Testing']"));
        actions.moveToElement(demoSite).perform();
        
        driver.get("https://www.globalsqa.com/demo-site/keyboard-events/");

        WebElement input = driver.findElement(By.id("input"));
        input.click();
        actions.sendKeys("Pratham Bansode").perform();

        actions.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("a").keyUp(org.openqa.selenium.Keys.CONTROL).perform();

        
        actions.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("c").keyUp(org.openqa.selenium.Keys.CONTROL).perform();

        
        actions.sendKeys(org.openqa.selenium.Keys.TAB).perform();

      
        actions.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("v").keyUp(org.openqa.selenium.Keys.CONTROL).perform();
    }

    @AfterMethod
    void closeBrowser() {

        if (driver != null) {
            driver.quit();
        }
    }
}
