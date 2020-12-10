package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OdooGithubCommunityPage extends BasePage {
    public OdooGithubCommunityPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/page/community']")
    protected WebElement communityMenu;

    @FindBy(css = "a[href='https://github.com/odoo']")
    protected WebElement github;

    @FindBy(css = "a[href='/login?return_to=%2Fodoo']")
    protected WebElement githubLogin;

    // Login to gitHub

    @FindBy(id = "login_field")
    protected WebElement emailInputField;

    @FindBy(id = "password")
    protected WebElement passwordField;

    @FindBy(css = "input[type='submit']")
    protected WebElement submitBtn;


    @FindBy(css = "a[class='UnderlineNav-item selected']")
    protected WebElement participants;

    @FindBy(css = "a[data-hovercard-url='/odoo/technical-training-solutions/hovercard']")
    protected WebElement technicalTrainingSolutionProject;

    @FindBy(css = " .Header-item.position-relative.mr-0.d-none.d-md-flex .Header-link span[class='dropdown-caret']")
    protected WebElement profileDropDown;

    @FindBy(css = "[href='/kainthhardeep?tab=repositories']")
    protected WebElement myRepositories;

    @FindBy(css = "h4[class='d-flex flex-items-baseline mb-2']")
    protected WebElement popUpText;

    public void connectToGithub() {
        waitInSeconds(2);
        communityMenu.click();
        github.click();
        githubLogin.click();
        emailInputField.click();
        emailInputField.sendKeys("kainthhardeep276@gmail.com");
        passwordField.sendKeys("Hardeepqa123");
        submitBtn.click();
        participants.click();
        jse.executeScript("window.scrollBy(0,250)");
        waitInSeconds(4);
        technicalTrainingSolutionProject.click();
        profileDropDown.click();
        waitInSeconds(2);
        myRepositories.click();
    }
}