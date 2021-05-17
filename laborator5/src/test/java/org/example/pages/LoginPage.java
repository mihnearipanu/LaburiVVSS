package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {
    @FindBy(id="user-name")
    private WebElement usernameInput;
    @FindBy(id="password")
    private WebElement passwordInput;

    @FindBy(name="login-button")
    private WebElement loginButton;


    public void fillUsername(String username)
    {
        usernameInput.sendKeys(username);
    }

    public void fillPassword(String password)
    {
        passwordInput.sendKeys(password);
    }

    public void pressLoginButton()
    {
        loginButton.click();
    }

    public boolean isOnPage() {
        return getDriver().getCurrentUrl().equals("https://www.saucedemo.com/");
    }
}