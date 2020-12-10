package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResetPasswordPage extends BasePage {
    public ResetPasswordPage(WebDriver driver) {
        super(driver);
    }

    // First of all we will have to logout applications as its already logged in by before class

//    @FindBy (css = "#top a[data-toggle='dropdown']")
    @FindBy (css = "#top > div > div > div > a")
    protected WebElement dropDownMenuBtn;

    @FindBy (id = "o_logout")
    protected WebElement logoutBtn;

    @FindBy(css = "a[href='/web/login']")
    protected WebElement signInBtn;

    @FindBy(css = "a[href='/web/reset_password']")
    protected WebElement resetPasswordBtn;

    @FindBy(id = "login")
    protected WebElement inputEmailField;

    @FindBy(css = "button[type='submit']")
    protected WebElement submitBtn;

    @FindBy(css = "p[class='alert alert-success']")
    protected WebElement emailSentForResetVisibleText;

    public void doResetPassword() {
        waitInSeconds(2);
        dropDownMenuBtn.click();
//        wdWait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
        logoutBtn.click();
        waitInSeconds(3);

        signInBtn.click();
//        wdWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/web/reset_password']")));
        resetPasswordBtn.click();
        inputEmailField.sendKeys("hardeepmtl@gmail.com");
        submitBtn.click();
    }
}
