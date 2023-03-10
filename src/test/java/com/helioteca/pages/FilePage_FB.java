package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage_FB extends BasePage {


    public FilePage_FB() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
/*
    public void navigateTo(String page) {
        WebElement linkToPage = Driver.getDriver().findElement(By.xpath("//a[@aria-label='" + page + "']"));
        linkToPage.click();
    }

 */



    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAllCheckbox;




}