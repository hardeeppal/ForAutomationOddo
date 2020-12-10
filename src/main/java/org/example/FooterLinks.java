package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterLinks extends BasePage {
    @FindBy(css = "a[href='/web/about/facebook']")
    protected WebElement facebookLkn;

    @FindBy(css = "i[class='fa fa-twitter']")
    protected WebElement twitterLkn;

    @FindBy(css = "i[class='fa fa-linkedin']")
    protected WebElement linkedInLkn;

    @FindBy(css = "i[class='fa fa-envelope']")
    protected WebElement mailLkn;

    @FindBy(css = "img[src='//odoocdn.com/openerp_website/static/src/img/2016/flags/en_US.png']")
    protected WebElement languageSelectorDropdown;

    @FindBy(css = "a[href='/fr_FR/my']")
    protected WebElement selectFrenchLanguageSelector;

    @FindBy(css = "a[data-lang='en_US']")
    protected WebElement selectEnglishLanguageSelector;


    public FooterLinks(WebDriver driver) {
        super(driver);
    }

    public void openFbLink() {
        facebookLkn.click();
    }

    public void openTwitterLkn() {
        twitterLkn.click();
    }

    public void openLinkedIn() {
        linkedInLkn.click();
    }

    public void setSelectFrenchLanguageSelector() {
        languageSelectorDropdown.click();
        selectFrenchLanguageSelector.click();
    }
}
