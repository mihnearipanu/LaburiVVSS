package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.junit.Assert;

public class LoginSteps {
    public LoginPage loginPage;
    public HomePage homePage;
    @Step
    public void fillUsername(String username){
        loginPage.fillUsername(username);
    }
    @Step
    public void fillPassword(String password){
       loginPage.fillPassword(password);
    }
    @Step
    public void pressLoginButton(){
        loginPage.pressLoginButton();
    }
    @Step
    public void login(String username,String password){
        loginPage.open();
        fillUsername(username);
        fillPassword(password);
        pressLoginButton();
    }
    @Step
    public void loginIs(boolean status)
    {
        Assert.assertEquals("login not equal status",homePage.isLogedin(),status);
    }
}
