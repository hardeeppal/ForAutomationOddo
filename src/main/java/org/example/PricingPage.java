package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PricingPage extends BasePage {

    @FindBy(css = "a[href='/pricing']")
    protected WebElement pricingMenu;

    @FindBy(id = "users")
    protected WebElement numberOfUsers;

    @FindBy(css = "#app_crm + span[class='fa fa-check text-center']")
    protected WebElement CRMMenu;

    // coming to extra integration
    @FindBy(css = "#app_delivery_dhl + span[class='fa fa-check text-center']")
    protected WebElement DHLExpressShippingLink;

    @FindBy(css = "#app_sale_amazon + span[class='fa fa-check text-center']")
    protected WebElement amazonShippingLink;

    // Choosing hosting type
    @FindBy(css = "label[for='hosting_premise']")
    protected WebElement onPremiseRadioBtn;

// Implementation Service
//    @FindBy(css = "label[for='imp_success']")
//    protected WebElement packsFromOddoBtn;

    @FindBy(css = "a[class='btn btn-primary ml-md-auto']")
    protected WebElement readMoreBtn;

    // Scroll up by using JavascriptExecutor
    @FindBy(css = "button[type='submit']")
    protected WebElement buyNowBtn;

// Button for clicking to success packs from oddo

    @FindBy(css = "span[class='o_ripple d-block position-absolute rounded-circle'] + span")
    protected WebElement successPacksFromOdoo;

    @FindBy(css = "sup[class='my_cart_quantity badge badge-primary']")
    protected WebElement myCartBtn;

    @FindBy(css = "span[class='o_ripple d-block position-absolute rounded-circle'] +span")
    protected WebElement processToCheckout;

    //new code added
    @FindBy(css = "button[type='submit']")
    protected WebElement buyNow;

    @FindBy(css = "sup[class='my_cart_quantity badge badge-primary']")
    protected WebElement cart;

    @FindBy(css = "a[class='o_thread_window_close fa fa-close']")
    protected WebElement popup;

    public void validatePricingMenu() {
        pricingMenu.click();
        waitInSeconds(2);
        numberOfUsers.clear();
        numberOfUsers.sendKeys("3");
        waitInSeconds(2);
        CRMMenu.click();
        waitInSeconds(2);
        DHLExpressShippingLink.click();
        waitInSeconds(2);
        amazonShippingLink.click();
        waitInSeconds(2);
        onPremiseRadioBtn.click();
        waitInSeconds(2);
//        popup.click();
        waitInSeconds(2);
        waitInSeconds(2);
//        browser.findElement(By.cssSelector("span[class='o_thread_window_buttons'] > a")).click();
        buyNow.click();
        waitInSeconds(5);
        cart.click();
    }

    public PricingPage(WebDriver driver) {
        super(driver);
    }
}