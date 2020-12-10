//package org.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.Date;
//
//public class SignUpPageTest extends BasePageTest {
//
//    LoginPage loginPage;
//    LandingPage landingPage;
//    SignUpRegisterPage signupPage;
//    PricingPage pricingPage;
//    //    CommunityPage communityPage;
//    SignInPage signInPage;
//    ResetPasswordPage resetPasswordPage;
//    HandlingShoppingCartPage handlingCart;
//    OdooGithubCommunityPage odooGithubCommunityPage;
//    MyDataBase myDataBase;
//    SalesPiplinePage salesPiplinePage;
//    PartnerDashboard partnerDashboard;
//    TourPage tourPage;
//    WriteForCommunity writeForCommunity;
//    ScheduleDemo scheduleDemo;
//    FooterLinks footerLinks;
//
//    // Here will write login with credatis so we need before class in evry test almost
//    @BeforeClass
//    public void doLogin() {
//        browser.get("https://www.odoo.com/");
//        signInPage = PageFactory.initElements(browser, SignInPage.class);
//        waitInSeconds(2);
//        signInPage.doLogin();
//    }
//
//    @Test(priority = 0, enabled = false)
//    public void signUpTest() {
//        landingPage = PageFactory.initElements(browser, LandingPage.class);
//        landingPage.doLogOut();
//        landingPage.signInBtnClick();
//        loginPage = PageFactory.initElements(browser, LoginPage.class);
//        loginPage.goToRegisterPage();
//        signupPage = PageFactory.initElements(browser, SignUpRegisterPage.class);
//        signupPage.fillUserDetailsAndSignUp("hardeepmtl+" + new Date().getTime() + "@gmail.com", "Harman", "123ABC");
////        signupPage.fillDefaultUserDetailsAndSignup();
//        String URL = browser.getCurrentUrl();
//        Assert.assertEquals(URL, "https://www.odoo.com/my");
//    }
//
//    @Test(priority = 0, enabled = false)
//    public void ForgetPasswordTest() {
//        browser.get("https://www.odoo.com/web/login");
//        loginPage = PageFactory.initElements(browser, LoginPage.class);
//        Assert.assertEquals(loginPage.getUrl(), "https://www.odoo.com/web/login");
//        loginPage.clickResetPassBtn();
//        Assert.assertEquals(browser.getCurrentUrl(), "https://www.odoo.com/web/reset_password");
//        loginPage.fillRecoveryEmail();
//        loginPage.sentEnterEmail();
//    }
//
//    @Test(priority = 1, enabled = true)
//    public void tryForFreeTest() {
//        browser.get("https://www.odoo.com/web/login");
//        loginPage = PageFactory.initElements(browser, LoginPage.class);
//        loginPage.clickTryForFreeBtn();
//        loginPage.selectDropDownMenu();
//        loginPage.clickSales();
//        loginPage.clickOnFeatures();
//        String URL = browser.getCurrentUrl();
//        Assert.assertEquals(URL,"https://www.odoo.com/page/sales-features");
//    }
//
////    @Test(priority = 2, enabled = false)
////    public void communityMenuTest() {
////        browser.get("https://www.odoo.com/");
////        communityPage = PageFactory.initElements(browser, CommunityPage.class);
////        communityPage.playVideoINCommunitySection();
////    }
//
//    @Test(priority = 3, enabled = true)
//    public void pricingMenuTest() {
//        pricingPage = PageFactory.initElements(browser, PricingPage.class);
//        pricingPage.validatePricingMenu();
//
//    }
//
//    @Test(priority = 4, enabled = true)
//    public void shoppingCartTest() {
//        handlingCart = PageFactory.initElements(browser, HandlingShoppingCartPage.class);
//        pricingPage = PageFactory.initElements(browser, PricingPage.class);
//        pricingPage.validatePricingMenu();
//        handlingCart.manageCartProducts();
//    }
//
//    @Test(priority = 5, enabled = false)
//    public void signInPageTest() {
//        waitInSeconds(4);
//        Assert.assertEquals(browser.getCurrentUrl(), "https://www.odoo.com/web/login");
//    }
//
//    @Test(priority = 6, enabled = false)
//    public void resetPasswordTest() {
//        resetPasswordPage = PageFactory.initElements(browser, ResetPasswordPage.class);
//        resetPasswordPage.doResetPassword();
//        Assert.assertEquals(true, resetPasswordPage.emailSentForResetVisibleText.isDisplayed());
//    }
//
//    @Test(priority = 7, enabled = false)
//    public void odooGithubCommunityTest() {
//        odooGithubCommunityPage = PageFactory.initElements(browser, OdooGithubCommunityPage.class);
//        odooGithubCommunityPage.connectToGithub();
//        WebElement popUpTextIntroduceUser = browser.findElement(By.cssSelector("h4[class='d-flex flex-items-baseline mb-2']"));
//        Assert.assertEquals(true, popUpTextIntroduceUser.isDisplayed());
//        System.out.println("Pop is Displayed, Assert is passed ..!");
//    }
//
//    @Test(priority = 8, enabled = false)
//    public void checkMyDatabase() {
//        myDataBase = PageFactory.initElements(browser, MyDataBase.class);
//        myDataBase.accessMyDatabase();
//    }
//
//    @Test(priority = 9, enabled = false)
//    public void createNewPipelineTest() {
//        waitInSeconds(4);
//        salesPiplinePage = PageFactory.initElements(browser, SalesPiplinePage.class);
//        salesPiplinePage.createNewPipeline();
//    }
//
//    @Test(priority = 10, enabled = false)
//    public void partnerDashboardTest() {
//        partnerDashboard = PageFactory.initElements(browser, PartnerDashboard.class);
//        partnerDashboard.goToPartnerDashboard();
//        Assert.assertEquals(true, partnerDashboard.becomeAPartnerText.isDisplayed());
//        System.out.println("Am in the partnerDashboard Page. Script Passed....");
//        partnerDashboard.eLearningPageBtn.click();
//    }
//
//    @Test(priority = 11, enabled = false)
//    public void oddoTourTest() {
//        tourPage = PageFactory.initElements(browser, TourPage.class);
//        tourPage.takeOddoTour();
//    }
//
//    @Test(priority = 12, enabled = false)
//    public void writeForCommunityTest() {
//        writeForCommunity = PageFactory.initElements(browser, WriteForCommunity.class);
//        writeForCommunity.doWriteForCommunity();
//    }
//
////    @Test(priority = 13, enabled = true)
////    public void scheduleDemoTest() {
////        scheduleDemo = PageFactory.initElements(browser, ScheduleDemo.class);
////        scheduleDemo.scheduleDemo();
////        Assert.assertTrue(scheduleDemo.demoMeetingScheduleVisibleText.isDisplayed());
////        scheduleDemo.deleteAppointment();
////        waitInSeconds(2);
////        String messageaftercancelbutton = browser.findElement(By.cssSelector("#popup-content > p")).getText();
////        waitInSeconds(2);
////        Assert.assertEquals(messageaftercancelbutton, "Are you sure you want to cancel this appointment?");
////        browser.findElement(By.cssSelector("#confirm-cancel")).click();
////        String messageaftercancelapp = browser.findElement(By.cssSelector("#appointment-form > div.alert.alert-success.dynamic-alert > span")).getText();
////
////        Assert.assertEquals(messageaftercancelapp, "Your appointment has been canceled");
////    }
//
//    @Test(priority = 14, enabled = true)
//    public void footerLinkTest() {
//        waitInSeconds(3);
//        browser.get("https://www.odoo.com/");
//        waitInSeconds(3);
//        String mainWindowHandle = browser.getWindowHandle();
//        footerLinks = PageFactory.initElements(browser, FooterLinks.class);
//        footerLinks.openFbLink();
//        browser.navigate().back();
//        waitInSeconds(2);
//        footerLinks.openTwitterLkn();
//        waitInSeconds(2);
//        browser.navigate().back();
//        waitInSeconds(2);
//        footerLinks.openTwitterLkn();
//        waitInSeconds(2);
//        browser.navigate().back();
//        waitInSeconds(2);
//        footerLinks.setSelectFrenchLanguageSelector();
//        waitInSeconds(2);
//        browser.navigate().back();
////        scheduleDemo.deleteAppointment();
//    }
//
////    @Test(dependsOnMethods = {"scheduleDemoTest"}, enabled = true)
////    public void cancelScheduleMeetingTest() {
////        scheduleDemo.deleteAppointment();
////    }
//}
