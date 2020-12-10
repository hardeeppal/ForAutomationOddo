package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {
    // @Factory annotation creates tests dynamically at runTime
    @FindBy (css = "#top a[data-toggle='dropdown']")
    protected WebElement dropDownMenuBtn;

    @FindBy (id = "o_logout")
    protected WebElement logoutBtn;

    @FindBy(css = ("a[href='/web/login']"))
    protected WebElement signInBtn;

    public void doLogOut() {
        dropDownMenuBtn.click();
        logoutBtn.click();
    }

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void signInBtnClick() {
        signInBtn.click();
    }

}
