package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckoutTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);

        inventoryPage.addBackpackToCart();
        inventoryPage.clickCart();

        CartPage cartPage = new CartPage(driver);

        Assert.assertTrue(
                cartPage.isBackpackDisplayed(),
                "Backpack is not present in cart"
        );

        cartPage.clickCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);

        checkoutPage.enterCheckoutInformation(
                "Prathamesh",
                "Bansode",
                "411001"
        );

        checkoutPage.clickFinish();

        Assert.assertEquals(
                checkoutPage.getConfirmationMessage(),
                "Thank you for your order!",
                "Order confirmation message is incorrect"
        );
    }
}