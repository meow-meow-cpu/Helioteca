package com.helioteca.step_definitions;

import com.helioteca.pages.BasePage;
import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US13_StepsDefs extends BasePage {

    @When("the user clicks the magnifier icon on the right top")
    public void theUserClicksTheMagnifierIconOnTheRightTop() {
        searchButton.click();
    }


    @And("users search any existing file, folder, contact\\({string})")
    public void usersSearchAnyExistingFileFolderContact(String contact) {
        BrowserUtils.waitFor(2);
        searchBox.sendKeys(contact);

    }

    @Then("verify the app displays the expected result {string} option")
    public void verifyTheAppDisplaysTheExpectedResultOption(String contact) {
        Assert.assertTrue(searchResult.getText().contains(contact));

    }
}
