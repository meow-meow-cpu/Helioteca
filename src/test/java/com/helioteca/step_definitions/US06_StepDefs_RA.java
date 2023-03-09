package com.helioteca.step_definitions;

import com.helioteca.pages.RemoveFromFavoritesPageRA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US06_StepDefs_RA {

    RemoveFromFavoritesPageRA removeFromFavoritesPageRA = new RemoveFromFavoritesPageRA();

    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        removeFromFavoritesPageRA.homePage.click();
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String moduleName) {
        removeFromFavoritesPageRA.navigateToModule(moduleName).click();
    }

    @When("the users clicks action icon from any file or folder on the page to remove")
    public void theUsersClicksActionIconFromAnyFileOrFolderOnThePageToRemove() {
        removeFromFavoritesPageRA.favoriteActionBtn.click();
    }
//
//    @And("user choose the {string} option")
//    public void userChooseTheOption(String arg0) {
//    }
//
//    @And("user click the {string} sub module on the left side")
//    public void userClickTheSubModuleOnTheLeftSide(String arg0) {
//    }
//
//    @Then("Verify that the file is not listed in the Favorites table")
//    public void verifyThatTheFileIsNotListedInTheFavoritesTable() {
//    }
}
