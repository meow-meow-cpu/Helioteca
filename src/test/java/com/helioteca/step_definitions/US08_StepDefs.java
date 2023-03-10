package com.helioteca.step_definitions;

import com.helioteca.pages.FilesPage_AO;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class US08_StepDefs extends FilesPage_AO {


    //FilesPage filesPage = new FilesPage();
    //BasePage basePage = new BasePage();
    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {

    }

    @When("the user clicks the Files module")
    public void theUserClicksTheModule() {
        //files.click();
    }

    @And("user clicks the add icon on the top")
    public void userClicksTheAddIconOnTheTop() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(plusButton));
        plusButton.click();

    }

    @And("user click \"new folder”")
    public void userClickNewFolder() {
        newFolder.click();
    }

    @And("user write a folder name")
    public void userWriteAFolderName() {

    }

    @And("user write a folder {string}")
    public void userWriteAFolder(String fldrName) {
        folderName.sendKeys(fldrName);
    }

    @When("the user click submit icon")
    public void theUserClickSubmitIcon() {
        submitButton.click();
    }


    @Then("Verify the folder {string} is displayed on the page")
    public void verifyTheFolderIsDisplayedOnThePage(String fldrName) {
        WebElement newFolder = Driver.getDriver().findElement(By.xpath("//span[text()='" + fldrName + "']"));
        //Assert.assertTrue(newFolder.isDisplayed());
        Assert.assertEquals(newFolder.getText(), fldrName);
    }


    @And("user choose a folder {string} from the page")
    public void userChooseAFolderFromThePage(String fldrName) {
        WebElement newFolder = Driver.getDriver().findElement(By.xpath("//tr[@data-file='" + fldrName + "']"));
        newFolder.click();
    }

    //  @When("the user uploads a file with the upload file option")
    // public void theUserUploadsAFileWithTheUploadFileOption() {
    //      String path = "C:\\Users\\artog\\Downloads\\empty.txt";
    //       WebElement uploadFileElement = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
    //       uploadFileElement.sendKeys(path);
    //   }


    @And("user uploads file with the “upload file” option")
    public void usersUploadsFileWithTheUploadFileOption() {
        String absolutePath = new File("src/test/resources/Files/forTest.txt").getAbsolutePath();
        uploadFileOpt.sendKeys(absolutePath);
    }

    @Then("Verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
        Assert.assertTrue(newFile.isDisplayed());
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String page) {
        navigateTo(page);
    }


}
