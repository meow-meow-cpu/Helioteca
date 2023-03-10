package com.helioteca.step_definitions;

import com.helioteca.pages.LoginPage_DY;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US02_StepDefs extends LoginPage_DY {
    //LoginPage_DY loginpage = new LoginPage_DY();

    //LoginPage_DY loginpage;
    @When("user enter invalid {string} and {string}")
    public void userEnterInvalidAnd(String arg0, String arg1) {
        userName.sendKeys(arg0);
        password.sendKeys(arg1);
    }

    @And("user click the login button")
    public void userClickTheLoginButton() {
        loginBtn.click();
    }

    @Then("verify Wrong username or password. message should be displayed")
    public void verifyWrongUsernameOrPasswordMessageShouldBeDisplayed() {
        String warningMsg = "Wrong username or password.";
        Assert.assertEquals(wrongMsg.getText(), warningMsg);

    }
}



