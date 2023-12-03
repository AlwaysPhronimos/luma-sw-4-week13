package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.ShoppingCart;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest {
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        // Mouse Hover on Gear Menu
        Thread.sleep(1000);
        homePage.mouseHoverOnGearTab();
        Thread.sleep(1000);
        // Click on Bags
        homePage.mouseHoverAndClickOnBagsInGear();
        Thread.sleep(1000);
        // Click on Product Name ‘Overnight Duffle’
        productPage.clickOnProductOvernightDuffle();
        // Verify the text ‘Overnight Duffle’
        Assert.assertEquals(productPage.verifyOvernightDuffleText(),"Overnight Duffle");
        // Change Qty 3
        productPage.changeQty("3");
        // Click on ‘Add to Cart’ Button.
        productPage.clickOnAddToCartButton();
        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(productPage.verifyProductAddedToCartMessage(),"You added Overnight Duffle to your shopping cart.");
        // Click on ‘shopping cart’ Link into message
        productPage.clickOnShoppingCartLink();
        // Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(shoppingCart.verifyProductNameOvernightDuffle(),"Overnight Duffle");
        //Verify the Qty is ‘3’
        Assert.assertEquals(shoppingCart.verifyProductOvernightDufflePriceText(),"3");
        // Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingCart.verifyProductOvernightDufflePriceText(),"$135.00");
        // Change Qty to ‘5’
        shoppingCart.changeFieldInCart("5");
        Thread.sleep(2000);
        // Click on ‘Update Shopping Cart’ button
        shoppingCart.updateShoppingCart();
        // Verify the product price ‘$225.00’
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCart.verifyProductPrice(),"$225.00");

    }
}

