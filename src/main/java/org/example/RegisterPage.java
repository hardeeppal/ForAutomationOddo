package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Date;

public class RegisterPage extends BasePage {

    @FindBy(css = "a[href='/web/login']")
    protected WebElement signInBtn;

    @FindBy(css = ("a[href='/web/signup']"))
    protected WebElement doNotHaveAccBtn;

    @FindBy(id = "login")
    protected WebElement enterEmail;

    @FindBy(id = "name")
    protected WebElement name;

    @FindBy(id = "password")
    protected WebElement password;

    @FindBy(css = (".text-center.oe_login_buttons.pt-3 > .btn.btn-primary.float-left"))
    protected WebElement signUpBtnToRegister;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void fillDefaultUserDetailsAndSignUp() {
//        email.sendKeys("yben4993+"+ new Date().getTime() + "+@gmail.com");
//        email.sendKeys("hardeepmtl+" + new Date().getSeconds()+"@gmail.com);
        signInBtn.click();
        doNotHaveAccBtn.click();
//        enterEmail.sendKeys("hardeepmtl@gmail.com");
        enterEmail.sendKeys("hardeepmtl+" + new Date().getSeconds() + "@gmail.com");

        name.sendKeys("Harman");
        password.sendKeys("Abcd1234");
        signUpBtnToRegister.click();
    }

    public void fillUserDetailsAndSignUp(String emailId, String Username, String userPass) {
        signInBtn.click();
        doNotHaveAccBtn.click();
        enterEmail.sendKeys(emailId);
        name.sendKeys(Username);
        password.sendKeys(userPass);
        signUpBtnToRegister.click();
    }

    public String getTitle() {
        waitInSeconds(2);
        return browser.getTitle();
    }
}

