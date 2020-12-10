package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class DocumentsPage extends AppsDropDownPage {
    @FindBy(css = "a[class='mt32 mb8 btn btn-primary o_btn_cta']")
    protected WebElement startNowBtn;

    @FindBy(id = "username")
    protected WebElement fAndLNameInputField;

    @FindBy(id = "email")
    protected WebElement emailInput;

    @FindBy(id = "companyName")
    protected WebElement companyName;

    @FindBy(id = "phoneNumber")
    protected WebElement phoneNumber;

    @FindBy(id = "country-id")
    protected WebElement countryDropDown;


    @FindBy(css = "select[name='lang']")
    protected WebElement languageSelectorDropDown;

    @FindBy(css = "company_size")
    protected WebElement companySizeDropDown;

    @FindBy(id = "plan")
    protected WebElement primaryInterestDropdown;

    @FindBy(css = "button[type='submit']")
    protected WebElement submitBtn;

    @FindBy(css = "b[class='o_selected_app_title']")
    protected WebElement odooDocumentsVisibleText;

    public DocumentsPage(WebDriver driver) {
        super(driver);
    }

    public void openInstantDocuments() {
        startNowBtn.click();
    }

    public void fillDefaultDetailsForDocumentAccess() {
        fAndLNameInputField.sendKeys("electric, hardeep pal");
        emailInput.sendKeys("kainthhardeep236@gmail.com");
        companyName.sendKeys("Electric");
        phoneNumber.sendKeys("5147061983");
        Select chooseCountry = new Select(countryDropDown);
        chooseCountry.selectByVisibleText("Cameroon");
        waitInSeconds(2);
        Select selectLanguage = new Select(languageSelectorDropDown);
        selectLanguage.selectByVisibleText("English");
        waitInSeconds(2);
        Select companySize = new Select(companySizeDropDown);
        companySize.selectByIndex(2);
        waitInSeconds(2);
        Select currentStatus = new Select(primaryInterestDropdown);
        currentStatus.selectByVisibleText("I am a student");
        waitInSeconds(2);
        submitBtn.click();
    }
}
