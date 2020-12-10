package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadERPWhitePaperPage extends BasePage {

    @FindBy(css = "a[href='/page/odoo-white-paper']")
    protected WebElement whitePaperMenu;

    public DownloadERPWhitePaperPage(WebDriver driver) {
        super(driver);
    }

    public void downloadERPWhitePaper() {
        ExplicitWaitByCss(whitePaperMenu);
    }

}
