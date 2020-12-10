package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DownloadERPPaperPageTest extends BasePageTest{
    SignInPage signInPage;
    DownloadERPWhitePaperPage downloadERPWhitePaperPage;

    @Test
    public void downloadERPWhitePaper() {
        signInPage = PageFactory.initElements(browser,SignInPage.class);
        signInPage.doLogin();
        downloadERPWhitePaperPage = PageFactory.initElements(browser,DownloadERPWhitePaperPage.class);
        downloadERPWhitePaperPage.downloadERPWhitePaper();
    }
}
