package testautomationtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class practiceform2 extends practiceform {

    @Test(priority=1)
    void additionalDetails() {

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.id("subjectsInput")).sendKeys("Maths");

        WebElement maths = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'subjects-auto-complete__option') and contains(text(),'Maths')]")));

        maths.click();
       
        driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();

        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\PRATHAM\\git\\repository\\automationtesting\\fctlogo.png");
       
        driver.findElement(By.id("currentAddress")).sendKeys("Pune, Maharashtra, India");

        WebElement state = wait.until(ExpectedConditions.elementToBeClickable(By.id("state")));

        state.click();

        WebElement stateOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'option') and text()='NCR']")));

        stateOption.click();


      
        WebElement city = wait.until( ExpectedConditions.elementToBeClickable(By.id("city")));

        city.click();

        WebElement cityOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'option') and text()='Delhi']")));

        cityOption.click();
    }
}