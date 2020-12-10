package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPageTest extends BasePageTest {
    SignInPage signInPage;
    ResetPasswordPage resetPasswordPage;

    @Test(priority = 0, enabled = true)
    public void loginTest() {
        signInPage = PageFactory.initElements(browser, SignInPage.class);
        waitInSeconds(4);
        browser.get("https://www.odoo.com/");
        signInPage.doLogin();
        Assert.assertTrue(signInPage.visibleText.isDisplayed());
    }

    @Test(priority = 1, enabled = true)
    public void restPassword() {
        resetPasswordPage = PageFactory.initElements(browser, ResetPasswordPage.class);
        browser.get("https://www.odoo.com/");
        resetPasswordPage.doResetPassword();
        Assert.assertEquals(browser.getCurrentUrl(), "https://www.odoo.com/web/reset_password");

    }
}
