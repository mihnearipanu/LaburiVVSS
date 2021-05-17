package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.HomePage;
import org.junit.Assert;

public class AddToCartSteps {
    public HomePage homePage;
    @Step
    public void AddBackpackToCart(){
        homePage.addBackpackToCart();
    }
    @Step
    public  void AddBikeLightToCart()
    {
        homePage.addBikeLightToCart();
    }
    @Step
    public void BackpackIsInCart()
    {
        Assert.assertTrue("backpack not in cart",homePage.isBackpackInCart());
    }
    @Step
    public void BikeLightIsInCart()
    {
        Assert.assertTrue("bike light not in cart",homePage.isBikeLightInCart());
    }

    public void GoToCart() {
        homePage.clickCartButton();
    }
}
