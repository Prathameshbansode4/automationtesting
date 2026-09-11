package com.parabank;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ParaBankOpenAccount {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabankv2/index.htm");
        Thread.sleep(2000);

        // LOGIN
        driver.findElement(By.name("username")).sendKeys("prathamesh");
        driver.findElement(By.name("password")).sendKeys("prathamesh@123");
        driver.findElement(By.cssSelector("input[value='Log In']")).click();
        Thread.sleep(3000);

        // FIRST ACCOUNT - SAVINGS
        driver.findElement(By.linkText("Open New Account")).click();
        Thread.sleep(2000);

        new Select(driver.findElement(By.id("type")))
                .selectByVisibleText("SAVINGS");

        new Select(driver.findElement(By.id("fromAccountId")))
                .selectByIndex(0);

        driver.findElement(
                By.cssSelector("input[value='Open New Account']"))
                .click();

        Thread.sleep(3000);

        System.out.println("First Account Created");

        // SECOND ACCOUNT - CHECKING
        driver.findElement(By.linkText("Open New Account")).click();
        Thread.sleep(2000);

        new Select(driver.findElement(By.id("type")))
                .selectByVisibleText("CHECKING");

        new Select(driver.findElement(By.id("fromAccountId")))
                .selectByIndex(0);

        driver.findElement(
                By.cssSelector("input[value='Open New Account']"))
                .click();

        Thread.sleep(3000);

        String pageText = driver.findElement(By.tagName("body")).getText();

        System.out.println(pageText);

        if (pageText.contains("Account Opened!")) {
            System.out.println("SECOND ACCOUNT OPEN TEST PASSED");
        } else {
            System.out.println("SECOND ACCOUNT OPEN TEST FAILED");
        }

        Thread.sleep(2000);

        driver.quit();
    }
}