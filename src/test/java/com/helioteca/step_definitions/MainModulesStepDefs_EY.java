package com.helioteca.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class MainModulesStepDefs_EY {

    @Then("the user should be on the dashboard")
    public void theUserShouldBeOnTheDashboard() {
    }

    @And("the user should see the below modules")
    public void theUserShouldSeeTheBelowModules(List<String> modules) {
        System.out.println("modules = " + modules);
    }

    @Then("the user should be able to click on each module")
    public void the_user_should_be_able_to_click_on_each_module() {

    }


}
