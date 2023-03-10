package com.helioteca.step_definitions;

import com.helioteca.pages.BasePage_EY;
import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US03_StepDefs {

    @And("the user should see the below modules")
    public void theUserShouldSeeTheBelowModules(List<String> expectedModules) {
        System.out.println("Expected Modules = " + expectedModules);


        List<WebElement> actualModule_as_WebElement = Driver.getDriver().findElements(By.xpath("//ul[@id='appmenu']/li/a[@aria-label]"));

        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : actualModule_as_WebElement) {
            String module = eachModule.getAttribute("aria-label");
            actualModules.add(module);
        }

        actualModules.remove(9);

        System.out.println("Actual Modules = " + actualModules);

        Assert.assertEquals(expectedModules, actualModules);
    }

    BasePage_EY basePage_ey = new BasePage_EY();

    @Then("the user should be able to click on each module and see each module page")
    public void theUserShouldBeAbleToClickOnEachModuleAndSeeEachModulePage() {

        basePage_ey.files.click();
        BrowserUtils.verifyTitleContains("Files");

        basePage_ey.photos.click();
        BrowserUtils.verifyTitleContains("Photos");

        basePage_ey.activity.click();
        BrowserUtils.verifyTitleContains("Activity");

        basePage_ey.mail.click();
        BrowserUtils.verifyTitleContains("Mail");

        basePage_ey.contacts.click();
        BrowserUtils.verifyTitleContains("Contacts");

        basePage_ey.calendar.click();
        BrowserUtils.verifyTitleContains("Calendar");

        basePage_ey.notes.click();
        BrowserUtils.verifyTitleContains("Notes");

        basePage_ey.deck.click();
        BrowserUtils.verifyTitleContains("Deck");

        basePage_ey.tasks.click();
        BrowserUtils.verifyTitleContains("Tasks");
    }
}

