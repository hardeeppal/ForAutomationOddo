package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PricingPageTest extends BasePageTest {
    SignInPage signInPage;
    PricingPage pricingPage;
    @Test(priority = 3, enabled = true)
    public void pricingMenuTest() {
        browser.get("https://www.odoo.com/");
//        signInPage = PageFactory.initElements(browser,SignInPage.class);
//        signInPage.doLogin();
        pricingPage = PageFactory.initElements(browser, PricingPage.class);
        pricingPage.validatePricingMenu();
        String URL = browser.getCurrentUrl();
        Assert.assertEquals(URL,"https://www.odoo.com/shop/cart");
    }
}
