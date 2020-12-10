package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PartnerDashboard extends BasePage {

    @FindBy(css = "button[class='o_social_push_notifications_permission_deny btn btn-light']")
    protected WebElement denyPopUp;

    @FindBy(css = "a[class='dropdown-toggle']")
    protected WebElement dropDown;

    @FindBy(css = "a[href='/my/partner']")
    protected WebElement partnerDashboardMenu;

    @FindBy(css = "span[class='o_app_name_title']")
    protected WebElement becomeAPartnerText;

    @FindBy(css = "a[href='https://www.odoo.com/slides']")
    protected WebElement eLearningPageBtn;

    @FindBy(css = "h1[class='display-1 text-white']")
    protected WebElement visibleTextKnowledge;

    public PartnerDashboard(WebDriver driver) {
        super(driver);
    }

    public void goToPartnerDashboard() {
        denyPopUp.click();
        dropDown.click();
        partnerDashboardMenu.click();
        jse.executeScript("window.scrollBy(0,1000)");
        switchToWindow();
    }

}
