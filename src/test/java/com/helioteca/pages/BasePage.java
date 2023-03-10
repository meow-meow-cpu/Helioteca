package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {                        //!!!!!!!!!!change locators!!!!!!!!!!!!!!

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='header-menu unified-search']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"header-menu-unified-search\"]/div[2]/ul/li[1]/a/span/h3/span/strong")
    public WebElement searchResult;

    public void navigateTo(String page) {
        WebElement linkToPage = Driver.getDriver().findElement(By.xpath("//a[@aria-label='" + page + "']"));
        linkToPage.click();
    }


    @FindBy()                     //Ali
    public WebElement files;


}
