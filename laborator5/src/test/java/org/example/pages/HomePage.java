package org.example.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class HomePage extends PageObject {
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    private WebElement AddToCartBackpackButton;
    @FindBy(id="add-to-cart-sauce-labs-bike-light")
    private WebElement AddToCartBikeLightButton;
    @FindBy(css=".shopping_cart_link")
    private WebElement CartButton;
    @FindBy(id="react-burger-menu-btn")
    private WebElement MenuButton;
    @FindBy(id="logout_sidebar_link")
    private WebElement LogOutButton;

    public void addBackpackToCart() {
        AddToCartBackpackButton.click();
    }
    public void addBikeLightToCart(){
        AddToCartBikeLightButton.click();
    }

    public boolean isBackpackInCart()
    {
        return getDriver().findElements( By.id("remove-sauce-labs-backpack") ).size() != 0;
    }

    public boolean isBikeLightInCart()
    {
        return getDriver().findElements( By.id("remove-sauce-labs-bike-light")).size() != 0;
    }

    public boolean isLogedin()
    {
        return getDriver().getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
    }
    public void clickCartButton()
    {
        CartButton.click();
    }

    public void clickMenuButton() {
        MenuButton.click();
    }

    public void clickLogOutButton() {
        LogOutButton.click();
    }
}
