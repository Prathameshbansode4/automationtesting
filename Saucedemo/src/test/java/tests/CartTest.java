package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CartTest extends BaseTest {

    @Test
    public void verifyProductInCart() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addBackpackToCart();
        inventoryPage.clickCart();
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isBackpackDisplayed(), "Backpack is not present in cart");
    }

    @Test
    public void removeProductFromCart() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addBackpackToCart();
        inventoryPage.clickCart();
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isBackpackDisplayed(), "Backpack was not added to cart");
        cartPage.removeBackpack();
        Assert.assertFalse(cartPage.isBackpackDisplayed(), "Backpack was not removed from cart");
    }
}