package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterLinkTest extends BasePageTest {
    FooterLinks footerLinks;
    SignInPage signInPage;

    @Test(priority = 14, enabled = true)
    public void footerLinkTest() {
        waitInSeconds(3);
        browser.get("https://www.odoo.com/");
        signInPage = PageFactory.initElements(browser, SignInPage.class);
//        signInPage.doLogin();
        footerLinks = PageFactory.initElements(browser, FooterLinks.class);

        footerLinks.openFbLink();
        browser.navigate().back();
        waitInSeconds(2);
        footerLinks.openTwitterLkn();
        waitInSeconds(2);
        browser.navigate().back();
        waitInSeconds(2);
        footerLinks.openTwitterLkn();
        waitInSeconds(2);
        browser.navigate().back();
        waitInSeconds(2);
        footerLinks.setSelectFrenchLanguageSelector();
        waitInSeconds(2);
        browser.navigate().back();
        String URL = browser.getCurrentUrl();
        Assert.assertEquals(URL,"https://www.odoo.com/my");
    }
}
