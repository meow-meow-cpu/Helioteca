package com.helioteca.step_definitions;

import com.helioteca.pages.RemoveFromFavoritesPageRA;
import com.helioteca.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class US06_StepDefs {

    RemoveFromFavoritesPageRA removeFromFavoritesPageRA = new RemoveFromFavoritesPageRA();


    @Then("the user clicks action icon from created folder")
    public void theUserClicksActionIconFromCreatedFolder() {
        removeFromFavoritesPageRA.actionBtn.click();
    }

    @And("user choose {string} option")
    public void userChooseOption(String optionName) {
        removeFromFavoritesPageRA.navigateToOption(optionName).click();
        BrowserUtils.sleep(1);
    }

    @When("the users clicks action icon from created folder")
    public void theUsersClicksActionIconFromCreatedFolder() {
        removeFromFavoritesPageRA.actionBtn.click();
        BrowserUtils.sleep(1);
    }
    @And("user choose the {string} option")
    public void userChooseTheOption(String optionName) {
        removeFromFavoritesPageRA.navigateToOption(optionName).click();
        BrowserUtils.sleep(1);
    }

    @And("user click the {string} sub module on the left side")
    public void userClickTheSubModuleOnTheLeftSide(String subModule) {
        removeFromFavoritesPageRA.navigateToSubModule(subModule).click();
    }

    @Then("Verify that the folder is not listed in the Favorites table")
    public void verifyThatTheFolderIsNotListedInTheFavoritesTable() {
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//table[@class='list-container']//tr[@data-file='Helioteca']"));
    }
}