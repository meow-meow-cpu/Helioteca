package com.helioteca.pages;




import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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

    public void navigateTo(String page){
        WebElement linkToPage = Driver.getDriver().findElement(By.xpath("//a[@aria-label='"+page+"']"));
        linkToPage.click();
    }


    @FindBy()                     //Ali
    public WebElement files;


    @FindBy()                     //Dili
    public WebElement photos;

    @FindBy()                     //Narmin
    public WebElement activity;

    @FindBy()                     //Ferid
    public WebElement mail;

    @FindBy()                     //Mustakima
    public WebElement contacts;

    @FindBy()                     //Ali
    public WebElement calendar;

    @FindBy()                     //Dili
    public WebElement notes;

    @FindBy()                     //Narmin
    public WebElement deck;

    @FindBy()                     //Ferid
    public WebElement tasks;

    @FindBy()                     //Mustakima
    public WebElement logOutBtn;



    //Something advanced is below, I don't think we will need it at this stage//
//**********************************************************************************************
    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement pageSubTitle;

    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     */
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
        }
    }

}
