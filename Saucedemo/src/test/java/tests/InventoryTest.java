package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import base.BaseTest;
import pages.InventoryPage;
import pages.LoginPage;

public class InventoryTest extends BaseTest {

    @Test
    public void verifyInventoryPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertEquals(inventoryPage.getInventoryTitle(), "Products", "Inventory page title is incorrect");
    }

    @Test
    public void addProductsToCart() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addBackpackToCart();
        inventoryPage.addBikeLightToCart();
        inventoryPage.clickCart();
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isBackpackDisplayed(), "Sauce Labs Backpack is not present in cart");
        Assert.assertTrue(cartPage.isBikeLightDisplayed(), "Sauce Labs Bike Light is not present in cart");
    }

    @Test
    public void sortProducts() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.sortProductsBy("Price (low to high)");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Sorting failed");
    }
}