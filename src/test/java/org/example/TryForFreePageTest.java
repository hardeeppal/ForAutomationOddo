package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TryForFreePageTest extends BasePageTest {
    SignInPage signInPage;
    LoginPage loginPage;

    @Test
    public void tryForFreeOptionTest() {
        waitInSeconds(4);
        browser.get("https://www.odoo.com/");

//        signInPage = PageFactory.initElements(browser, SignInPage.class);
//        signInPage.doLogin();
//        loginPage = PageFactory.initElements(browser, LoginPage.class);
        waitInSeconds(3);
        loginPage.clickTryForFreeBtn();
        waitInSeconds(3);
        loginPage.selectDropDownMenu();
        waitInSeconds(3);
        loginPage.clickSales();
        waitInSeconds(3);
        loginPage.clickOnFeatures();
        waitInSeconds(3);
        String URL = browser.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.odoo.com/page/sales-features");
    }
}
