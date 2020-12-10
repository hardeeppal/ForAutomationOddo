package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreatePipelineTest extends BasePageTest {
    SignInPage signInPage;
    SalesPiplinePage salesPiplinePage;

    @Test(priority = 9, enabled = true)
    public void createNewPipelineTest() {
        signInPage = PageFactory.initElements(browser,SignInPage.class);
        signInPage.doLogin();
        waitInSeconds(4);
        salesPiplinePage = PageFactory.initElements(browser, SalesPiplinePage.class);
        salesPiplinePage.createNewPipeline();
        String User  =salesPiplinePage.addUser("ronrik");
//        salesPiplinePage.deleteUser(User);
    }
}
