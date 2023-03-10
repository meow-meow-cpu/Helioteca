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

public class BasePage_EY {


    public BasePage_EY() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void navigateTo(String page) {
        WebElement linkToPage = Driver.getDriver().findElement(By.xpath("//a[@aria-label='" + page + "']"));
        linkToPage.click();
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Files']")
    public WebElement files;

    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Photos']")
    public WebElement photos;

    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Activity']")
    public WebElement activity;

    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Mail']")
    public WebElement mail;

    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Contacts']")
    public WebElement contacts;

    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Calendar']")
    public WebElement calendar;

    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Notes']")
    public WebElement notes;

    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Deck']")
    public WebElement deck;

    @FindBy(xpath = "//ul[@id='appmenu']/li/a[@aria-label='Tasks']")
    public WebElement tasks;

    @FindBy()
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
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)), 5);
        }
    }

}
