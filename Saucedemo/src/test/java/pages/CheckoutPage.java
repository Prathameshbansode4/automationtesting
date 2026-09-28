package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");

    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");

    private By confirmationMessage = By.className("complete-header");

    public void enterFirstName(String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName))
                .sendKeys(value);
        pause(2);
    }

    public void enterLastName(String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName))
                .sendKeys(value);
        pause(2);
    }

    public void enterPostalCode(String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(postalCode))
                .sendKeys(value);
        pause(2);
    }

    public void clickContinue() {

        wait.until(ExpectedConditions.elementToBeClickable(continueButton))
                .click();

        // IMPORTANT: wait until checkout step 2 loads
        wait.until(ExpectedConditions.urlContains("checkout-step-two"));

        // Wait until Finish button is actually available
        wait.until(ExpectedConditions.visibilityOfElementLocated(finishButton));

        pause(3);
    }

    public void clickFinish() {

        wait.until(ExpectedConditions.elementToBeClickable(finishButton))
                .click();

        pause(3);
    }

    public void enterCheckoutInformation(
            String firstNameValue,
            String lastNameValue,
            String postalCodeValue) {

        enterFirstName(firstNameValue);
        enterLastName(lastNameValue);
        enterPostalCode(postalCodeValue);

        clickContinue();
    }

    public String getConfirmationMessage() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(confirmationMessage)
        ).getText();
    }

    private void pause(int seconds) {

        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}