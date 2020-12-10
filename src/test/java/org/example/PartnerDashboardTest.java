package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PartnerDashboardTest extends BasePageTest {
    SignInPage signInPage;
    PartnerDashboard partnerDashboard;

    @Test(priority = 10, enabled = true)
    public void partnerDashboardTest() {
        signInPage = PageFactory.initElements(browser, SignInPage.class);
//        signInPage.doLogin();
        partnerDashboard = PageFactory.initElements(browser, PartnerDashboard.class);
        partnerDashboard.goToPartnerDashboard();
        Assert.assertEquals(true, partnerDashboard.becomeAPartnerText.isDisplayed());
        System.out.println("Am in the partnerDashboard Page. Script Passed....");
        partnerDashboard.eLearningPageBtn.click(); }
}
