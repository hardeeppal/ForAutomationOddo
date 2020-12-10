package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppsDropDownPageTest extends BasePageTest {
    AppsDropDownPage appsDropDownPage;

    @Test(enabled = true)
    public void openAppsDropdown() {
        appsDropDownPage = PageFactory.initElements(browser, AppsDropDownPage.class);
        waitInSeconds(3);
        appsDropDownPage.clickOnAppsDropDown();
    }
    @Test(enabled = true,dependsOnMethods = {"openAppsDropdown"})
    public int openAppsDropdownSizeCount() {
        appsDropDownPage = PageFactory.initElements(browser, AppsDropDownPage.class);
        int size = appsDropDownPage.getCountAppsDropdown();
        System.out.println(size);
        return size;
    }
//    public int clickOnSurvey() {
//        appsDropDownPage.clickOnModule()
//    }
}
//public class DashboardPageTest extends LoginTest {
//
//    @Test(priority = 2)
//    // @Test
//    public void acceptAlertTest() {
//
//        // browser.get("https://matrixcollege123.litmos.com/home/dashboard");
//        waits(2);
//        dashboardPage = PageFactory.initElements(browser, DashboardPage.class);
//        waits(2);
//        Assert.assertEquals(dashboardPage.getTitle(), "Home");
//        waits(1);
//        dashboardPage.acceptAlert();
//        waits(1);
//
//    }
//
//}