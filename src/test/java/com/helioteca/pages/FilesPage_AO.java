package com.helioteca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage_AO extends BasePage {

    @FindBy(xpath ="//*[@id=\"controls\"]/div[2]/a")
    public WebElement plusButton;

    @FindBy(xpath = "//a[@data-action='folder']")
    public WebElement newFolder;

    @FindBy(xpath = "//label[@data-action='upload']")
    public WebElement uploadFile;

    @FindBy(xpath = "//form[@class='filenameform']/input")
    public WebElement folderName;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement submitButton;

    @FindBy(id = "file-upload")
    public WebElement uploadButton;

    @FindBy(xpath = "//tr[@data-type='file']")
    public WebElement newFile;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadFileOpt;








}
