package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OddoGithubCommunityTest extends BasePageTest {
    OdooGithubCommunityPage odooGithubCommunityPage;
    SignInPage signInPage;

    @Test(priority = 7, enabled = true)
    public void odooGithubCommunityTest() {
//        signInPage = PageFactory.initElements(browser, SignInPage.class);
//        signInPage.doLogin();
        odooGithubCommunityPage = PageFactory.initElements(browser, OdooGithubCommunityPage.class);
        odooGithubCommunityPage.connectToGithub();
//        WebElement popUpTextIntroduceUser = browser.findElement(By.cssSelector("h4[class='d-flex flex-items-baseline mb-2']"));
//        Assert.assertEquals(true, popUpTextIntroduceUser.isDisplayed());
        Assert.assertEquals(browser.getTitle(),"Your Repositories");
        System.out.println("Pop is Displayed, Assert is passed ..!");
    }
}
