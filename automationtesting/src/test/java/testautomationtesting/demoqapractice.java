package testautomationtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demoqapractice {

    ChromeDriver driver;
    WebDriverWait wait;

    @Test
    void completePracticeForm() {

       
        driver = new ChromeDriver();

        
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        
        driver.get("https://demoqa.com/automation-practice-form");

        
        driver.manage().window().maximize();

        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName"))).sendKeys("Pratham");

        
        driver.findElement(By.id("lastName")).sendKeys("Bansode");

        
        driver.findElement(By.id("userEmail")).sendKeys("pratham@gmail.com");

        
        driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();

       
        driver.findElement(By.id("userNumber")).sendKeys("9876543210");

        
        WebElement dob = driver.findElement(By.id("dateOfBirthInput"));

        dob.click();

        
        driver.findElement(By.className("react-datepicker__year-select")).click();

        driver.findElement(By.xpath("//option[@value='2006']")).click();

        
        driver.findElement(By.className("react-datepicker__month-select")).click();

        driver.findElement(By.xpath("//option[@value='5']")).click();

        
        driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day') and "+ "text()='5' and "+ "not(contains(@class,'outside-month'))]")).click();

       
        WebElement subjects = driver.findElement(By.id("subjectsInput"));

        subjects.sendKeys("Computer Science");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'subjects-auto-complete__option')]"))).click();

        
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();

       
        WebElement upload = driver.findElement(By.id("uploadPicture"));

        upload.sendKeys("C:\\Users\\PRATHAM\\git\\repository\\automationtesting\\fctlogo.png");

       
        driver.findElement(By.id("currentAddress")).sendKeys("Pune, Maharashtra, India");

      
        driver.findElement(By.id("state")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id,'react-select-3-option-0')]"))).click();

        
        driver.findElement(By.id("city")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id,'react-select-4-option-0')]"))).click();

        WebElement submit = driver.findElement(By.id("submit"));

        Actions actions = new Actions(driver);

        actions.moveToElement(submit).click().perform();

        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));

        Assert.assertTrue(modal.isDisplayed());

        System.out.println("Form submitted successfully!");

        System.out.println(driver.findElement(By.id("example-modal-sizes-title-lg")).getText());
        
    }

    
}
