package com.helioteca.step_definitions;

import com.helioteca.pages.FilePage_FB;
import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US04_StepDefs {

    FilePage_FB filePage_fb = new FilePage_FB();

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        filePage_fb.selectAllCheckbox.click();
        BrowserUtils.sleep(3);
    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {


        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//td[@class='selection']/input"));

        for (WebElement each : checkboxes) {
            Assert.assertTrue(each.isSelected());
        }


    }

}