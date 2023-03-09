package com.helioteca.step_definitions;

import com.helioteca.pages.FilesModulePage_EY;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11StepDefs_EY {

    FilesModulePage_EY filesModulePage_ey = new FilesModulePage_EY();
    @Then("the user should be on the dashboard")
    public void the_user_should_be_on_the_dashboard() {
    }

    @When("the user clicks on the Files module")
    public void the_user_clicks_on_the_files_module() {
        filesModulePage_ey.files.click();
    }

    @Then("the user clicks on action icon from any file on the page")
    public void the_user_clicks_on_action_icon_from_any_file_on_the_page() {
        filesModulePage_ey.action.click();
    }

    @Then("the user chooses the Details option")
    public void the_user_chooses_the_details_option() {
        filesModulePage_ey.details.click();
    }

    @Then("the user writes the comment {string} inside the input box")
    public void the_user_writes_the_comment_inside_the_input_box(String comment) {
        filesModulePage_ey.comments.click();
        filesModulePage_ey.commentsBox.sendKeys(comment);
    }

    @Then("the user clicks the submit button to post it")
    public void the_user_clicks_the_submit_button_to_post_it() {
        filesModulePage_ey.send.click();
    }

    @Then("verify the comment {string} is displayed in the comment section")
    public void verify_the_comment_is_displayed_in_the_comment_section(String comment) {
        Assert.assertTrue(filesModulePage_ey.commentPosted.isDisplayed());
    }
}
