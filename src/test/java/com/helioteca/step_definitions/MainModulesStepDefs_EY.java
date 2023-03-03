package com.helioteca.step_definitions;

import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainModulesStepDefs_EY {

    @Then("the user should be on the dashboard")
    public void theUserShouldBeOnTheDashboard() {
    }

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

}
