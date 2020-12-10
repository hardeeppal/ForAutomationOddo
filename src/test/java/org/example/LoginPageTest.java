package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTest extends BasePageTest {
    SignInPage signInPage;

    @Test
    public void doLogin() {
        signInPage = PageFactory.initElements(browser, SignInPage.class);
        waitInSeconds(2);
        signInPage.doLogin();
    }
}
