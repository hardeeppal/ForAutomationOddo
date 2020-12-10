package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AppsDropDownPage extends BasePage {
    // Here we gonna find on selector for open dropdown
    @FindBy(css = "#top > div.o_main_header_main >ul > li.dropdown > a")
//    protected WebElement appsDropDown;
            List<WebElement> appsDropDown;
    @FindBy(css = "#top > div.o_main_header_main >ul > li.dropdown > a")
    WebElement dropDown;

    @FindBy(css = "li.dropdown.show ul >li+li > a[href='/page/open-source-ecommerce']")
    protected WebElement eCommerce;

    @FindBy(css = "li.dropdown.show ul >li+li > a[href='/page/open-source-ecommerce']")
    protected WebElement blogs;

    @FindBy(css = "li > a[href='/page/blog-engine']")
    protected WebElement forums;

    @FindBy(css = "a[href='/page/community-builder']")
    protected WebElement events;

    @FindBy(css = "a[href='/page/events']")
    protected WebElement liveChat;

    @FindBy(css = "a[href='/page/live-chat']")
    protected WebElement eLearning;

    @FindBy(css = "a[href='/page/learning-management-system']")
    protected WebElement pointOfSale;

    @FindBy(css = "a[href='/page/subscriptions']")
    protected WebElement subscription;

    @FindBy(css = "a[href='/page/subscriptions']")
    protected WebElement sign;

    @FindBy(css = "a[href='/page/sign']")
    protected WebElement rental;

    @FindBy(css = "a[href='/page/rental']")
    protected WebElement amazonConnector;

    @FindBy(css = "div.col-md-3.o_productivity_apps > ul > li:nth-child(1) > a")
    protected WebElement communication;

    @FindBy(css = "#top > div > ul > li.dropdown.show > div > div > div > div.col-md-3.o_productivity_apps > ul > li:nth-child(1) > a")
    protected WebElement timeSheet;

    @FindBy(css = "li>a[href='/page/timesheet-mobile-app']")
    protected WebElement marketing;

    @FindBy(css = "a[href='/page/survey']")
    protected WebElement survey;

    @FindBy(css = "a[href='/page/approval-workflow']")
    protected WebElement approvals;

    @FindBy(css = "a[href='/page/appointments']")
    protected WebElement appointment;

    @FindBy(css = "div.col-md-3.o_productivity_apps li:nth-child(7) > a")
    protected WebElement documents;

    @FindBy(css = "a[href='/page/planning']")
    protected WebElement planning;


    public AppsDropDownPage(WebDriver driver) {
        super(driver);
//        waitInSeconds(2);
//        appsDropDown.click();
    }
    public int getCountAppsDropdown() {
        appsDropDown.size();
        return 0;
    }

    public AppsDropDownPage clickOnAppsDropDown() {
        dropDown.click();
        return PageFactory.initElements(browser, AppsDropDownPage.class);
    }

    public <V extends BasePage> V clickOnModule(String moduleName, Class<V> className) {
        if (moduleName.equalsIgnoreCase("websiteBuilder")) {
            appsDropDown.get(0).click();
            return PageFactory.initElements(browser, className);
//            browser.findElement(By.cssSelector("li a[href='/page/website-builder']")).click();
        } else if (moduleName.equalsIgnoreCase("eCommerce")) {
            eCommerce.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("blogs")) {
            blogs.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("forums")) {
            forums.click();
        } else if (moduleName.equalsIgnoreCase("events")) {
            events.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("liveChat")) {
            liveChat.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("eLearning")) {
            eLearning.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("pointOfSale")) {
            pointOfSale.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("subscriptions")) {
            subscription.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("sign")) {
            sign.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("rental")) {
            rental.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("amazonConnector")) {
            amazonConnector.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("communication")) {
            communication.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("timeSheet")) {
            timeSheet.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("marketing")) {
            marketing.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("survey")) {
            survey.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("approvals")) {
            approvals.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("appointment")) {
            appointment.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("documents")) {
            documents.click();
            return PageFactory.initElements(browser, className);
        } else if (moduleName.equalsIgnoreCase("planning")) {
            planning.click();
            return PageFactory.initElements(browser, className);
        } else
            System.out.println("Page with this name not found");
        return PageFactory.initElements(browser, null);
    }
}
