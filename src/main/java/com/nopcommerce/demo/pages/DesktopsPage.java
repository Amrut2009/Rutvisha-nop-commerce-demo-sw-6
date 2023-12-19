package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement clickOnDesktopsTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement verifyTheTextDesktops;


    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortBy;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement display;

    @CacheLookup
    @FindBy(xpath = "//div[@class='products-container']//h2/a")
    List<WebElement> productTitleList;


    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);
        log.info("Get pageTitle text " + pageTitle.getText());
        return message;
    }
    public String setVerifyTheTextDesktops(){
        return getTextFromElement(verifyTheTextDesktops);
    }




    public void selectSortBy(String position) {
        selectByVisibleTextFromDropDown(sortBy, position);
        log.info("Sort by '" + position + "' position");
    }

    public void selectDisplayPerPage(String number) {
        selectByVisibleTextFromDropDown(display, number);
        log.info("Display product '" + number + "' per page");
    }
    public void setClickOnDesktopsTab(){
        clickOnElement(clickOnDesktopsTab);
    }

    public void selectProduct(String productName) {
        for (WebElement product : productTitleList) {
            if (product.getText().equals(productName)) {
                log.info("Click on product '" + productName + "' : " + product.getText());
                clickOnElement(product);
                break;
            }
        }
    }




}
