package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WriteForCommunity extends BasePage{


    @FindBy(css = "a[href='/page/community']")
    protected WebElement communityMenu;

    @FindBy(css = "a[href='/page/write-for-community']")
    protected WebElement writeForCommunityMenu;

    @FindBy(css = "div[class='form-group form-field o_website_form_custom o_website_form_required_custom'] input[type='text']")
    protected WebElement inputField;

    @FindBy(css = "input[type='email']")
    protected WebElement emailIdInputField;

    @FindBy(css = "div[class='form-group form-field  o_website_form_custom'] input[type='text']")
    protected WebElement oddoDatabaseField;

    @FindBy(css = ".text-muted +input[type='text']")
    protected WebElement tutorialTitle;

    @FindBy(css = "label[class='col-form-label'] + textarea[class='form-control o_website_form_input']")
    protected WebElement input;

    @FindBy(css = "textarea[name='description']")
    protected WebElement introInput;

    @FindBy(css = "textarea[name='<b>Prerequisites</b>']")
    protected WebElement prerequisitesInputField;

    @FindBy(css = "textarea[name='<b>Outline</b>']")
    protected WebElement outlineInputField;


    @FindBy(css = "textarea[ name='<b>Writing Sample</b>']")
    protected WebElement sampleInput;

    @FindBy(css = "textarea[ name='<b>Expertise</b>']")
    protected WebElement expertiseInput;

    @FindBy(css = "textarea[ name='<b>Extra Info</b>']")
    protected WebElement extraInputField;

    @FindBy(css = "button[class='w-100 btn btn-primary btn-lg o_website_form_send']")
    protected WebElement submitBtn;

    public WriteForCommunity(WebDriver driver) {
        super(driver);
    }

    public void doWriteForCommunity() {
        communityMenu.click();
        writeForCommunityMenu.click();
        inputField.sendKeys("Harman");
        emailIdInputField.sendKeys("kainth3736@gmail.com");
        oddoDatabaseField.sendKeys("jdksbdf");
        tutorialTitle.sendKeys("sdfksdf");
        input.sendKeys("sfd");
        introInput.sendKeys("sfds");
        prerequisitesInputField.sendKeys("sassfd");
        outlineInputField.sendKeys("fqfewwq");
        sampleInput.sendKeys("ewfwqf");
        expertiseInput.sendKeys("wqfw");
        extraInputField.sendKeys("wqwff");
        submitBtn.click();
    }
}


