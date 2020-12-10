package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Date;
import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(css = ("a[href='/web/signup']"))
    protected WebElement doNotHaveAccBtn;

    @FindBy(css = ("a[href='/web/reset_password']"))
    protected WebElement resetBtn;

    @FindBy(id = "login")
    protected WebElement enterEmail;

    //    @FindBy(css = (".text-center.oe_login_buttons.pt-3 > .btn.btn-primary.float-left"))
    @FindBy(css = "button[type='submit']")
    protected WebElement confirmEmailBtn;

    @FindBy(css = "a[class='btn btn-primary']")
    protected WebElement tryForFreeBtn;

    //    @FindBy(css = "div[id='wrapwrap'] a[class='dropdown-toggle o-no-caret']")
    @FindBy(css = "a[class='dropdown-toggle o-no-caret']")
    protected List<WebElement> appsDropdown;

    @FindBy(css = ("a[href='/page/sales']"))
    protected WebElement salesMenu;

    @FindBy(css = "#top_menu a[href='/page/sales-features'] > span")
    protected WebElement features;

    @FindBy(id = "#part_5 + h2")
    protected WebElement featuresPageVisibleText;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goToRegisterPage() {
        doNotHaveAccBtn.click();
    }

    public void clickTryForFreeBtn() {
        tryForFreeBtn.click();
    }

    public void selectDropDownMenu() {
        appsDropdown.get(0).click();
    }



    public void clickSales() {
//        wdWait.until(ExpectedConditions.elementToBeClickable(salesMenu));
        waitInSeconds(4);
        salesMenu.click();
    }

    public void goToTryForFreeOption() {
        tryForFreeBtn.click();
        selectDropDownMenu();
        clickOnFeatures();
        clickResetPassBtn();
    }

    public void clickOnFeatures() {
        features.click();
    }

    public void clickResetPassBtn() {
        resetBtn.click();
    }

    public void fillRecoveryEmail() {
        enterEmail.sendKeys("hardeepmtl" + new Date().getSeconds() + "@gmail.com");
    }

    public void sentEnterEmail() {
        confirmEmailBtn.click();
    }

}
