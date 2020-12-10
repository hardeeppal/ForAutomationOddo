package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class RegisterPageTest extends BasePageTest {
    RegisterPage registerPage;

    @Test(priority = 0, enabled = true)
    public void signUpPageTest() {
        registerPage = PageFactory.initElements(browser, RegisterPage.class);
        registerPage.fillUserDetailsAndSignUp("hardeepmtl+" + new Date().getTime() + "@gmail.com", "Harman", "123ABC");
        String URL = browser.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.odoo.com/my");
    }
}
