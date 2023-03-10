package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesModulePage_EY {

    public FilesModulePage_EY(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Files']")
    public WebElement files;

    @FindBy(xpath = "//a[@data-action='menu']")
    public WebElement action;

    @FindBy(xpath = "//a[@data-action='Details']")
    public WebElement details;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement comments;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement commentsBox;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement send;

    @FindBy(xpath = "//div[@id='commentsTabView']/ul/li[@class='comment']")
    public WebElement commentPosted;
}
