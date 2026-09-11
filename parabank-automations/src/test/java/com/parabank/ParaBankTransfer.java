package com.parabank;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ParaBankTransfer {

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
        Thread.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("prathamesh@123");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[value='Log In']")).click();
        Thread.sleep(3000);

        // TRANSFER FUNDS
        driver.findElement(By.linkText("Transfer Funds")).click();
        Thread.sleep(2000);

        // ENTER AMOUNT
        driver.findElement(By.id("amount")).sendKeys("10");
        Thread.sleep(1500);

        // FROM ACCOUNT
        Select fromAccount = new Select(driver.findElement(By.id("fromAccountId")));

        System.out.println("From Account Options: " + fromAccount.getOptions().size());

        for (int i = 0; i < fromAccount.getOptions().size(); i++) {
            System.out.println("From Account " + i + ": " + fromAccount.getOptions().get(i).getText());
        }

        fromAccount.selectByIndex(0);
        Thread.sleep(1500);

        // TO ACCOUNT
        Select toAccount = new Select(driver.findElement(By.id("toAccountId")));

        System.out.println("To Account Options: " + toAccount.getOptions().size());

        for (int i = 0; i < toAccount.getOptions().size(); i++) {
            System.out.println("To Account " + i + ": " + toAccount.getOptions().get(i).getText());
        }

        toAccount.selectByIndex(0);
        Thread.sleep(1500);

        // TRANSFER
        driver.findElement(By.cssSelector("input[value='Transfer']")).click();
        Thread.sleep(3000);

        // VERIFY
        String pageText = driver.findElement(By.tagName("body")).getText();
        System.out.println(pageText);

        if (pageText.contains("Transfer Complete!")) {
            System.out.println("TRANSFER FUNDS TEST PASSED");
        } else {
            System.out.println("TRANSFER FUNDS TEST FAILED");
        }

        Thread.sleep(3000);

        driver.quit();
    }
}