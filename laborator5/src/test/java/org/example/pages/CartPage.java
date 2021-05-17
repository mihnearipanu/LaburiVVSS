package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CartPage extends PageObject {
    @FindBy(id="checkout")
    private WebElement checkoutButton;

    public boolean IsOnCartPage() {
        return getDriver().getCurrentUrl().equals("https://www.saucedemo.com/cart.html");
    }

    public void pressCheckoutButton() {
        checkoutButton.click();
    }
}
