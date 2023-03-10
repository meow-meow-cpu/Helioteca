package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage_RE {

    public FilesPage_RE() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href=\"/index.php/apps/files/\"]")
    public WebElement files;


    @FindBy(xpath = "//*[@id='fileList']/tr/td[2]/a/span[3]/a[2]")
    public WebElement Actions;

    @FindBy(xpath = "//a[@data-action='Favorite']")
    public WebElement favorites;

    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[3]/a")
    public WebElement favSubModule;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr/td[1]/a/span[1]/span")
    public WebElement favFirstElement;


}
