package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HandlingShoppingCartPage extends BasePage {
    public HandlingShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[class='o_social_push_notifications_permission_deny btn btn-light']")
    protected WebElement denyPopUpDialog;

    // Changing quantity in of CRM selector
    @FindBy(css = "input[data-product-id='817']")
    protected WebElement CRMQuantity;

    //DHL Removing From from cart selector
    @FindBy(css = "tr:nth-child(5) .fa.fa-trash-o")
    protected WebElement DHLRemovingFromCart;

    @FindBy(css = "span[class='o_ripple d-block position-absolute rounded-circle'] + span")
    protected WebElement processToCheckoutBtn;

    @FindBy(css = "a[href='/web/login?redirect=/shop/checkout']")
    protected WebElement loginBtn;

    @FindBy(css = "a[href='/web/login']")
    protected WebElement signInBtn;

    @FindBy(name = "login")
    protected WebElement emailInputField;

    @FindBy(id = "password")
    protected WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    protected WebElement submitBtn;


    public void manageCartProducts() {
        denyPopUpDialog.click();
        waitInSeconds(3);
        CRMQuantity.clear();
        CRMQuantity.sendKeys("4");
        waitInSeconds(2);
//        clickOnElementUsingMkbAction(processToCheckoutBtn);
////        processToCheckoutBtn.click();
//        waitInSeconds(2);
//        loginBtn.click();
//        waitInSeconds(2);
//        signInBtn.click();
//        emailInputField.sendKeys("hardeepmtl@gmail.com");
//        passwordField.sendKeys("123456Abcdef");
//        submitBtn.click();
    }

}
