package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpRegisterPage extends BasePage {

    @FindBy(id = "login")
    protected WebElement email;

    @FindBy(id = "name")
    protected WebElement name;

    @FindBy(id = "password")
    protected WebElement password;

    @FindBy(css = " .o_ripple.d-block.position-absolute.rounded-circle + i[class='fa fa-eye']")
    protected WebElement showPasswordBtn;

    @FindBy(css = (".text-center.oe_login_buttons.pt-3 > .btn.btn-primary.float-left"))
    protected WebElement signUpBtnToRegister;

    public SignUpRegisterPage(WebDriver driver) {
        super(driver);
    }

    public void fillDefaultUserDetailsAndSignup() {
//        email.sendKeys("yben4993+"+ new Date().getTime() + "+@gmail.com");
//        email.sendKeys("hardeepmtl+" + new Date().getSeconds()+"@gmail.com);
        email.sendKeys("hardeepmtl@gmail.com");
        name.sendKeys("Harman");
        password.sendKeys("Abcd1234");
        signUpBtnToRegister.click();
    }

    public void fillUserDetailsAndSignUp(String emailId, String Username, String userPass) {
        email.sendKeys(emailId);
        name.sendKeys(Username);
        password.sendKeys(userPass);
        signUpBtnToRegister.click();
    }

    public String getTitle() {
        waitInSeconds(2);
        return browser.getTitle();
    }
}
