package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
public class CheckOutPage extends PageObject {
    @FindBy(id="first-name")
    private WebElement FirstNameInput;
    @FindBy(id="last-name")
    private WebElement SecondNameInput;
    @FindBy(id="postal-code")
    private WebElement ZipCodeInput;
    @FindBy(id="continue")
    private WebElement ContinueButton;
    @FindBy(id="finish")
    private WebElement FinishButton;
    @FindBy(id="back-to-products")
    private WebElement BackButton;

    public boolean IsOnfirstCheckOutPage() {
        return getDriver().getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-one.html");
    }

    public void fillZipCode(String zipCode) {
    ZipCodeInput.sendKeys(zipCode);
    }

    public void fillSeconName(String secondName) {
        SecondNameInput.sendKeys(secondName);
    }

    public void fillFirstName(String firstName) {
        FirstNameInput.sendKeys(firstName);
    }

    public void pressContinue() {
        ContinueButton.click();
    }
    public boolean IsOnSecondCheckOutPage() {
        return getDriver().getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html");
    }

    public void pressFinish() {
        FinishButton.click();
    }

    public boolean IsOnCheckOutCompletePage() {
        return getDriver().getCurrentUrl().equals("https://www.saucedemo.com/checkout-complete.html");
    }

    public void clickOnBackHome() {
        BackButton.click();
    }
}
