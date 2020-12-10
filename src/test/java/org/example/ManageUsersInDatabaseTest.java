package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class ManageUsersInDatabaseTest extends BasePageTest{
    SignInPage signInPage;
    ManageUsersInDatabase manageUsersInDatabase;

    @Test
    public void openOdooUsers() throws AWTException {
        signInPage = PageFactory.initElements(browser,SignInPage.class);
        signInPage.doLogin();
        manageUsersInDatabase = PageFactory.initElements(browser,ManageUsersInDatabase.class);
        manageUsersInDatabase.myUsers();
//        String URL = browser.getCurrentUrl();
//        Assert.assertEquals(URL,"https://electric15.odoo.com/web#action=74&active_id=5&model=res.users&view_type=list&cids=1&menu_id=4");
        manageUsersInDatabase.uploadProfilePicture();


    }
}
