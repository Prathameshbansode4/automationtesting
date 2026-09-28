package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By cartTitle =By.className("title");

    private By backpackItem =
            By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Backpack']");

    private By bikeLightItem =
            By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Bike Light']");

    private By removeBackpack =
            By.id("remove-sauce-labs-backpack");

    private By checkoutButton =
            By.id("checkout");

    public String getCartTitle() {

        return driver.findElement(cartTitle).getText();
    }

    public boolean isBackpackDisplayed() {

        return !driver.findElements(backpackItem).isEmpty();
    }

    public boolean isBikeLightDisplayed() {

        return !driver.findElements(bikeLightItem).isEmpty();
    }

    public void removeBackpack() {

        driver.findElement(removeBackpack).click();

        pause(3);
    }

    public void clickCheckout() {

        driver.findElement(checkoutButton).click();

        pause(3);
    }

    private void pause(int seconds) {

        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}