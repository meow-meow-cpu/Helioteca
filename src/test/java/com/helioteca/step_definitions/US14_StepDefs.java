package com.helioteca.step_definitions;

import com.helioteca.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US14_StepDefs {


    @Then("the user should be on the dashboard")
    public void the_user_should_be_on_the_dashboard() {
    }


    @Then("the user should be able to see the following submodules")
    public void the_user_should_be_able_to_see_the_following_submodules(List<String> expectedSubmodules) {

        System.out.println("Expected Submodules: " + expectedSubmodules);

        List<WebElement> actualSubmodule_as_WebElement = Driver.getDriver().findElements(By.xpath("//a[@class='app-navigation-entry-link']/span[@title]"));

        List<String> actualSubmodules = new ArrayList<>();

        for (WebElement eachSubModule : actualSubmodule_as_WebElement) {
            String submodule = eachSubModule.getAttribute("title");
            actualSubmodules.add(submodule);
        }

        System.out.println("Actual Sub-Modules: " + actualSubmodules);

        Assert.assertEquals(actualSubmodules, expectedSubmodules);
    }
}
