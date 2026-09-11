package com.parabank;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ParaBankAccounts {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabankv2/index.htm");

        driver.findElement(By.name("username")).sendKeys("prathamesh");

        driver.findElement(By.name("password")).sendKeys("prathamesh@123");

        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
}
