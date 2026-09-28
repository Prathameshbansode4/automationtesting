package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {

    WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    private By inventoryTitle = By.className("title");

    private By backpack =
            By.id("add-to-cart-sauce-labs-backpack");

    private By bikeLight =
            By.id("add-to-cart-sauce-labs-bike-light");

    private By cartIcon =
            By.className("shopping_cart_link");

    private By sortDropdown =
            By.className("product_sort_container");

    public String getInventoryTitle() {
        return driver.findElement(inventoryTitle).getText();
    }

    public void addBackpackToCart() {
        driver.findElement(backpack).click();
        pause(2);
    }

    public void addBikeLightToCart() {
        driver.findElement(bikeLight).click();
        pause(2);
    }

    public void clickCart() {
        driver.findElement(cartIcon).click();
        pause(3);
    }

    public void sortProductsBy(String visibleText) {
        Select select = new Select(driver.findElement(sortDropdown));
        select.selectByVisibleText(visibleText);
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