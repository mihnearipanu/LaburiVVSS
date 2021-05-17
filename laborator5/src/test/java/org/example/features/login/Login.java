package org.example.features.login;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.LoginSteps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("goodLogin.csv")
public class Login {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;
    @Steps
    public LoginSteps loginSteps;

    String username,password;
    Number works;
    @Test
    public void logIn() throws InterruptedException {
        loginSteps.login(username,password);

        loginSteps.loginIs(works.equals(1));
    }
}