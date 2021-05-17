package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.junit.Assert;

public class LogoutSteps {
    public LoginPage loginPage;
    public HomePage homePage;

    @Step
    public void logout() {
        clickOnMenu();
        clickLogOut();
    }
    @Step
    private void clickLogOut() {
        homePage.clickLogOutButton();
    }

    @Step
    private void clickOnMenu() {
        homePage.clickMenuButton();

    }
    @Step
    public void isOnLoginPage() {
        Assert.assertTrue("not on login page", loginPage.isOnPage());
    }
}
