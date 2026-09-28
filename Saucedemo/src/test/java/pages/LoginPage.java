package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("h3[data-test='error']");

    public void enterUsername(String usernameValue) {
        driver.findElement(username).sendKeys(usernameValue);
        pause(2);
    }

    public void enterPassword(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
        pause(2);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
        pause(3);
    }

    public void login(String usernameValue, String passwordValue) {
        enterUsername(usernameValue);
        enterPassword(passwordValue);
        clickLogin();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    private void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
