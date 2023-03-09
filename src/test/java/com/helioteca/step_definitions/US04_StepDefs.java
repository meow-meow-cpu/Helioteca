package com.helioteca.step_definitions;

import com.helioteca.pages.FilePage_FB;
import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US04_StepDefs{

    FilePage_FB filePage_fb = new FilePage_FB();

    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        Driver.getDriver().get("https://qa.helioteca.com/index.php/apps/files/");
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String page) {
        filePage_fb.fileInput.click();
    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        filePage_fb.selectAllCheckbox.click();
    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        List<WebElement> selectedCheckboxWebElement = Driver.getDriver().findElements(By.xpath("//tbody[@id='fileList']/tr/td[@class='selection']/label"));

        for (WebElement each : selectedCheckboxWebElement) {
            Assert.assertTrue(each.isSelected());
        }
    }

}