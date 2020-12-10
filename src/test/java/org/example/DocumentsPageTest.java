package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DocumentsPageTest extends AppsDropDownPage {
    AppsDropDownPage appsDropDownPage;
    DocumentsPage documentsPage;

    public DocumentsPageTest(WebDriver driver) {
        super(driver);
    }


    @Test(enabled = true,priority = 0)
    public void openAppsDropdown() {
        appsDropDownPage = PageFactory.initElements(browser, AppsDropDownPage.class);
        waitInSeconds(3);
        appsDropDownPage.clickOnAppsDropDown();
    }
    @Test(enabled = true,priority = 1)
    public void openOdooDocumentsPage() {

        waitInSeconds(3);
        appsDropDownPage.clickOnAppsDropDown();
        waitInSeconds(3);
        appsDropDownPage.clickOnModule("documents", DocumentsPage.class);
        Assert.assertTrue(documentsPage.odooDocumentsVisibleText.isDisplayed());
        Assert.assertEquals(appsDropDownPage.getUrl(),browser.getCurrentUrl());
    }
}
//	} else if (moduleName.equalsIgnoreCase("Achievements")) {
//
//			achievements.click();
//			return PageFactory.initElements(browser, className)
//		achievementsPage = dashboardPage.getModule("Achievements", AchievementsPage.class);


//		achievementsPage = dashboardPage.getModule("Achievements", AchievementsPage.class);
////		dashboardPage.getModule("Achievements");
//        Assert.assertEquals(dashboardPage.getUrl(), browser.getCurrentUrl());