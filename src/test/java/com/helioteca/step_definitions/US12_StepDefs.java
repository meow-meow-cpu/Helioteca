package com.helioteca.step_definitions;

import com.helioteca.pages.ContactsModulePages_MG;
import com.helioteca.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US12_StepDefs {

    ContactsModulePages_MG contactsModulePages_mg = new ContactsModulePages_MG();

    @When("the user clicks the Contacts module")
    public void the_user_clicks_the_module() {
        contactsModulePages_mg.contacts.click();
    }

    @Then("verify the page title is \"Contacts - Helioteca”")
    public void verify_the_page_title_is_contacts_Helioteca() {
        BrowserUtils.verifyTitle("Contacts - Helioteca");
    }

}
