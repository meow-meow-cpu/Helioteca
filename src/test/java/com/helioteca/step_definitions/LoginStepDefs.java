package com.helioteca.step_definitions;

import com.helioteca.pages.LoginPage;
import com.helioteca.utilities.ConfigurationReader;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginStepDefs extends LoginPage {

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.getDriver().get("https://qa.helioteca.com/");
    }

    @Given("the user enters correct username {string}")
    public void theUserEntersCorrectUsername(String username) {
        userName.sendKeys(username);
    }

    @Then("the user enters correct password {string}")
    public void theUserEntersCorrectPassword(String pass) {
        password.sendKeys(pass);
    }

    @And("the user clicks on Log in button")
    public void theUserClicksOnLogInButton() {
        loginBtn.click();
    }


    @Given("the user logged in as {string}")                    //Change credentials!
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("driver")) {
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        } else if (userType.equalsIgnoreCase("sales manager")) {
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        } else if (userType.equalsIgnoreCase("store manager")) {
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username, password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }


}

