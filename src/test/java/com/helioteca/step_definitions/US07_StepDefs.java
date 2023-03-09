package com.helioteca.step_definitions;

import com.helioteca.pages.UploadFilePage_RA;
import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.File;

public class US07_StepDefs {

    UploadFilePage_RA uploadFilePageRa = new UploadFilePage_RA();

    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        uploadFilePageRa.dashboardPage.click();
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String moduleName) {
        uploadFilePageRa.navigateToModule(moduleName).click();
    }

    @When("the user clicks the add icon on the top")
    public void theUserClicksTheAddIconOnTheTop() {
        uploadFilePageRa.uploadIconBtn.click();
        BrowserUtils.sleep(2);
    }


    @And("users uploads file with the “upload file” option")
    public void usersUploadsFileWithTheUploadFileOption() {
        String absolutePath = new File("src/test/resources/UploadFile_RA/UploadFile_RA.txt").getAbsolutePath();
        uploadFilePageRa.uploadFileOpt.sendKeys(absolutePath);
    }

    @Then("verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
        BrowserUtils.verifyElementDisplayed(uploadFilePageRa.uploadedFile);
    }
}
