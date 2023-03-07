package com.helioteca.step_definitions;

import com.helioteca.pages.UploadFilePage_RA;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US07_StepDefs extends LoginStepDefs{

    UploadFilePage_RA uploadFilePageRa = new UploadFilePage_RA();
    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        Driver.getDriver().get("https://qa.helioteca.com/index.php/apps/files/?dir=/&fileid=2609");
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String moduleName) {

    }


    @When("the user clicks the add icon on the top")
    public void theUserClicksTheAddIconOnTheTop() {
    }

    @And("users uploads file with the “upload file” option")
    public void usersUploadsFileWithTheUploadFileOption() {
    }

    @Then("verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
    }
}
