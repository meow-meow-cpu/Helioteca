package com.helioteca.step_definitions;

import com.helioteca.pages.FilesPage_KA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class US10_StepDefs {

    FilesPage_KA filesPage_ka = new FilesPage_KA();

    @And("user clicks Settings on the left bottom corner")
    public void userClicksSettingsOnTheLeftBottomCorner() {
        filesPage_ka.settingBtn.click();
    }

    @Then("the user should be able to click any buttons")
    public void theUserShouldBeAbleToClickAnyButtons() {
        filesPage_ka.checkBox1.isEnabled();
        filesPage_ka.checkBox2.isEnabled();
        filesPage_ka.checkBox3.isEnabled();
    }

}
