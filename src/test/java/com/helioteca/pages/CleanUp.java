package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CleanUp {


    public CleanUp() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAll;
    @FindBy(xpath = "//*[@id=\"selectedActionsList\"]/a")
    public WebElement actions;
    @FindBy(xpath = "//*[@id=\"selectedActionsList\"]/div/ul/li[4]/a")
    public WebElement deleteAll;


}
