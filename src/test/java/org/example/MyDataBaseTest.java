package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MyDataBaseTest extends BasePageTest {
    MyDataBase myDataBase;
    SignInPage signInPage;

    @Test(priority = 8, enabled = true)
    public void checkMyDatabase() {
        signInPage = PageFactory.initElements(browser, SignInPage.class);
        signInPage.doLogin();
        myDataBase = PageFactory.initElements(browser, MyDataBase.class);
        myDataBase.accessMyDatabase();
    }
}
