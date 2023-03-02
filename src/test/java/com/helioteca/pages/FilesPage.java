package com.helioteca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage {

    @FindBy(xpath ="//*[@id=\"controls\"]/div[2]/a")
    public WebElement plusButton;

    @FindBy(xpath = "//a[@data-action='folder']")
    public WebElement newFolder;

    @FindBy(xpath = "//form[@class='filenameform']/input")
    public WebElement folderName;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement submitButton;








}
