package com.helioteca.step_definitions;

import com.helioteca.pages.FilesPage_KA;
import com.helioteca.pages.LoginPage;
import com.helioteca.utilities.ConfigurationReader;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.module.Configuration;

public class US10_StepDefs {

    FilesPage_KA filesPage_ka=new FilesPage_KA();
    LoginPage loginPage=new LoginPage();
    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        Driver.getDriver().get("https://qa.helioteca.com/index.php/login?clear=1");
        loginPage.login("User1","Userpass123");
        //Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String arg0) {
        filesPage_ka.filesBtn.click();

    }

    @And("user clicks Settings on the left bottom corner")
    public void userClicksSettingsOnTheLeftBottomCorner() {
        filesPage_ka.settingBtn.click();
    }

    @Then("the user should be able to click any buttons")
    public void theUserShouldBeAbleToClickAnyButtons() {
        filesPage_ka.checkBox1.isEnabled();
        filesPage_ka.checkBox2.isEnabled();
        filesPage_ka.checkBox3.isEnabled();
    }

}
