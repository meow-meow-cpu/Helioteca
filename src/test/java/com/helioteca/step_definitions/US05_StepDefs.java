package com.helioteca.step_definitions;

import com.helioteca.pages.FilesPage_RE;
import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US05_StepDefs {
FilesPage_RE files_renita = new FilesPage_RE();
    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        Driver.getDriver().get("https://qa.helioteca.com/index.php");
         // get driver to go to the dashboard page


    }

    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
        BrowserUtils.waitFor(2);
        files_renita.files.click();
        //create a locator for files module

    }

    @When("the user clicks action-icon from any file on the page")
    public void theUserClicksActionIconFromAnyFileOnThePage() {
        files_renita.Actions.click();


       // create a locator in pages_renita for action button


    }

    @And("user choose the Add to favorites option")
    public void userChooseTheOption() {

        files_renita.favorites.click();

          //create locator for add to favorites in pages_renita

    }

    @And("user click the Favorites sub-module on the left side")
    public void userClickTheSubModuleOnTheLeftSide() {
        files_renita.favSubModule.click();
        //  create a locator for favorites module
    }

    @Then("Verify the chosen file is listed on the table")
    public void verifyTheChosenFileIsListedOnTheTable() {

        Assert.assertTrue(files_renita.favFirstElement.isDisplayed());
        //assertion


    }
}
