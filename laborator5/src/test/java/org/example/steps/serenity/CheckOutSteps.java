package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.example.pages.CartPage;
import org.example.pages.CheckOutPage;
import org.junit.Assert;

public class CheckOutSteps {
    public CartPage cartPage;
    public CheckOutPage checkOutPage;

    @Step
    public void isOnCart() {
        Assert.assertTrue("not in cart",cartPage.IsOnCartPage());
    }
    @Step
    public void pressCheckOutButton(){
        cartPage.pressCheckoutButton();
    }

    @Step
    public void isOnFirstPartCheckout() {
        Assert.assertTrue("not in first part checkout",checkOutPage.IsOnfirstCheckOutPage());
    }

    @Step
    public void fillForm(String FirstName,String SecondName,String ZipCode) {
        fillFirstName(FirstName);
        fillSecondName(SecondName);
        fillZipCode(ZipCode);
    }

    private void fillZipCode(String ZipCode) {
        checkOutPage.fillZipCode(ZipCode);
    }

    private void fillSecondName(String SecondName) {
        checkOutPage.fillSeconName(SecondName);
    }

    private void fillFirstName(String FirstName) {
        checkOutPage.fillFirstName(FirstName);
    }

    @Step
    public void pressContinue()
    {
        checkOutPage.pressContinue();
    }
    @Step
    public void isSecondCheckOut(){
        Assert.assertTrue("not in second checkout",checkOutPage.IsOnSecondCheckOutPage());
    }
    @Step
    public void pressFinish()
    {
        checkOutPage.pressFinish();
    }
    @Step
    public void isCheckoutComplete()
    {
        Assert.assertTrue("not finished",checkOutPage.IsOnCheckOutCompletePage());
    }

    public void goBackHome() {
        checkOutPage.clickOnBackHome();
    }
}
