package com.helioteca.step_definitions;

import com.helioteca.pages.RemoveFromFavoritesPageRA;
import com.helioteca.utilities.BrowserUtils;
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

    @When("the users clicks action icon from created folder")
    public void theUsersClicksActionIconFromAnyFileOrFolderOnThePageToRemove() {
        removeFromFavoritesPageRA.favoriteActionBtn.click();
    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String optionName) {
        removeFromFavoritesPageRA.navigateToOption(optionName).click();
    }

    @And("user click the {string} sub module on the left side")
    public void userClickTheSubModuleOnTheLeftSide(String subModuleName) {
        removeFromFavoritesPageRA.favoritesSubModule.click();
    }

    @Then("Verify that the file is not listed in the Favorites table")
    public void verifyThatTheFileIsNotListedInTheFavoritesTable() {

    }






}
