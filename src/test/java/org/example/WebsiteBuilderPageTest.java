//package org.example;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//
//public class WebsiteBuilderPageTest extends AppsDropDownPage{
//    AppsDropDownPage appsDropDownPage;
//    WebsiteBuilderPage websiteBuilderPage;
//    public WebsiteBuilderPageTest(WebDriver driver) {
//        super(driver);
//    }
//    @Test(enabled = true)
//    public void openWebsiteBuilderPage() {
//        appsDropDownPage = PageFactory.initElements(browser,AppsDropDownPage.class);
//        appsDropDownPage.clickOnAppsDropDown();
//        websiteBuilderPage = PageFactory.initElements(browser,WebsiteBuilderPage.class);
//        websiteBuilderPage = appsDropDownPage.clickOnModule("Websitebuilder",WebsiteBuilderPage.class);
//    }
//}
//
//
////public class ContentLibraryPageTest extends DashboardPageTest {
////
////    @Test(priority = 3)
////    public void addNewExternalLearningRecord() {
////
////        contentLibraryPage = dashboardPage.getModule("ContentLibrary", ContentLibraryPage.class);
////        Assert.assertEquals(dashboardPage.getUrl(), browser.getCurrentUrl());
////        contentLibraryPage.display();
////    }
////
////}