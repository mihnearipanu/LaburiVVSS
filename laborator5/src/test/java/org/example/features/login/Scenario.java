package org.example.features.login;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.AddToCartSteps;
import org.example.steps.serenity.CheckOutSteps;
import org.example.steps.serenity.LoginSteps;
import org.example.steps.serenity.LogoutSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class Scenario {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;
    @Steps
    public LoginSteps loginSteps;
    @Steps
    public AddToCartSteps addToCartSteps;

    @Steps
    public CheckOutSteps checkOutSteps;
    @Steps
    public LogoutSteps logoutSteps;

    @Test
    public void scenario() throws InterruptedException {
        loginSteps.login("standard_user","secret_sauce");
        loginSteps.loginIs(true);
        addToCartSteps.AddBackpackToCart();
        addToCartSteps.BackpackIsInCart();
        addToCartSteps.AddBikeLightToCart();
        addToCartSteps.BikeLightIsInCart();
        addToCartSteps.GoToCart();
        checkOutSteps.isOnCart();
        checkOutSteps.pressCheckOutButton();
        checkOutSteps.isOnFirstPartCheckout();
        checkOutSteps.fillForm("a","a","2");
        checkOutSteps.pressContinue();
        checkOutSteps.isSecondCheckOut();
        checkOutSteps.pressFinish();
        checkOutSteps.isCheckoutComplete();
        checkOutSteps.goBackHome();
        loginSteps.loginIs(true);
        logoutSteps.logout();
        logoutSteps.isOnLoginPage();
    }

}
