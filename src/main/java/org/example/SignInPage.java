package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/web/login']")
    protected WebElement signInBtn;

    @FindBy(name = "login")
    protected WebElement emailInputField;

    @FindBy(id = "password")
    protected WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    protected WebElement submitBtn;

    @FindBy(css = "span[itemprop='name']")
    protected WebElement visibleText;


    public void doLogin() {
        signInBtn.click();
//        emailInputField.sendKeys("hardeepmtl+"+ new Date().getTime()+"+ @gmail.com");
        emailInputField.sendKeys("hardeepmtl@gmail.com");
        passwordField.sendKeys("Gmail123");
        submitBtn.click();
    }
    public void resetPassword() {

    }
}
