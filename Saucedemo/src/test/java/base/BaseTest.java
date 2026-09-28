package base;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeMethod
    public void setup() {

        ChromeOptions options = new ChromeOptions();

        // Disable Chrome password manager and password leak warning
        Map<String, Object> prefs = new HashMap<>();

        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);

        options.addArguments("--disable-features=PasswordLeakDetection");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://www.saucedemo.com/");

       
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {

            try {
                driver.quit();
            } catch (Exception e) {
                System.out.println("Browser already closed.");
            }

            driver = null;
        }
    }

    public void pause(int seconds) {

        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
