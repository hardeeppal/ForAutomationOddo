package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class ScheduleDemo extends BasePage {
    @FindBy(css = "a[class='float-left o_logo']")
    protected WebElement logo;

    @FindBy(css = "button[class='btn px-1 py-0 close']")
    protected WebElement exitPopUp;

    @FindBy(css = "a[href='https://www.odoo.com/r/meeting-us']")
    protected WebElement scheduleDemoBtn;
    @FindBy(id = "popup-set-timezone")
    protected WebElement setTimeZoneBtn;
    @FindBy(css = "td[data-qa='monthly-calendar-25-day-select'] > span[class='scheduledate'] ")
//    @FindBy(id = "lbl_appt1601051400")
    protected WebElement calenderDateSelected;
    @FindBy(css = "#step-pick-appointment   tr > th:nth-child(3) > a")
    protected WebElement nextMonthCalenderBtn;
    @FindBy(css = "tr:nth-child(5)")
    protected WebElement timeSelectedFromCalender;
    @FindBy(css = "label[aria-label='7:30am']")
    protected WebElement TimeSelectorBtn;
    @FindBy(css = ".btn.btn-primary.btn-block.btn-next-step")
    protected WebElement continueBtn;
    @FindBy(id = "first-name")
    protected WebElement fNameInputField;
    @FindBy(id = "last-name")
    protected WebElement lNameInputField;
    @FindBy(id = "phone")
    protected WebElement phoneNumber;
    @FindBy(id = "email")
    protected WebElement emailId;
    @FindBy(css = "#custom-forms > div.custom-form > div:nth-child(1) > input")
    protected WebElement skypeId;
    @FindBy(css = "div:nth-child(2) >.text.form-control")
    protected WebElement country;
    @FindBy(css = "#custom-forms > .custom-form div:nth-child(3) .text.form-control")
    protected WebElement companyWebsite;
    @FindBy(css = "#custom-forms > .custom-form div:nth-child(4) .form-control")
    protected WebElement userCountDropdownOption;
    @FindBy(css = "#custom-forms > .custom-form div:nth-child(5) .form-control")
    protected WebElement companyNeedsInputField;
    @FindBy(css = ".form-group div:nth-child(4) > label")
    protected WebElement salesRadioBtn;
    @FindBy(css = "input[value='Inventory']")
    protected WebElement inventoryRadioBtn;
    @FindBy(css = "div.custom-form > div:nth-child(7) label:nth-child(2) > input")
    protected WebElement odooImplimentationBtn;
    @FindBy(css = "#custom-forms div:nth-child(8) label:nth-child(2) > input[type=radio]")
    protected WebElement alreadyContactWithOdooBtn;
    @FindBy(css = ".form-group.required-field select[class='form-control']")
    protected WebElement hostingTypeDropDown;
    @FindBy(css = "input[class='btn btn-primary submit-forms-nopay']")
    protected WebElement submitDemoScheduleInformationBtn;
    @FindBy(id = "appt-cancel")
    protected WebElement cancelAppointmentBtn;
    @FindBy(css = "div[class='client-name babel-ignore']")
    protected WebElement userName;
    @FindBy(css = "h1[class='client-app-title']")
    protected WebElement demoMeetingScheduleVisibleText;
    @FindBy(id = "verify-timezone")
    private WebElement timeZoneDropdown;


    public ScheduleDemo(WebDriver driver) {
        super(driver);
    }

    public boolean scheduleDemo() {
        String mainWindowHandle = browser.getWindowHandle();
        logo.click();
//        exitPopUp.click();
        scheduleDemoBtn.click();
        waitInSeconds(2);
        Set<String> allWindowHandles = browser.getWindowHandles();

        String secondWindowHandle = null;
        for (String handles : allWindowHandles) {
            if (!handles.equalsIgnoreCase(mainWindowHandle)) {
                secondWindowHandle = handles;
            }
            browser.switchTo().window(mainWindowHandle);
        }
        waitInSeconds(2);
        WebDriver secondHandle = browser.switchTo().window(secondWindowHandle);
        //waitInSeconds(2);
        waitInSeconds(3);
        Select selectCountry = new Select(timeZoneDropdown);
        selectCountry.selectByIndex(2);
        WebElement abc = browser.findElement(By.cssSelector("#timezone-container > a"));
        scrollIntoViewUsingJse(abc);
        waitInSeconds(2);
        setTimeZoneBtn.click();
        waitInSeconds(2);
        calenderDateSelected.click();
        waitInSeconds(3);
        nextMonthCalenderBtn.click();
        waitInSeconds(3);
        timeSelectedFromCalender.click();
        waitInSeconds(3);
        TimeSelectorBtn.click();
        waitInSeconds(2);
        continueBtn.click();
        waitInSeconds(2);
        fNameInputField.sendKeys("Harman");
        lNameInputField.sendKeys("herman");
        phoneNumber.sendKeys("5147061605");
        emailId.sendKeys("harmanmandrid242@gmail.com");
        skypeId.sendKeys("233234");
        country.sendKeys("Canada");
        companyWebsite.sendKeys("electricsrec@gmail.com");
        Select numberOfUsers = new Select(userCountDropdownOption);
        userCountDropdownOption.isSelected();
        numberOfUsers.selectByIndex(2);
        companyNeedsInputField.sendKeys("aclsjf sdmsnjkd");
        salesRadioBtn.click();
        inventoryRadioBtn.click();
        odooImplimentationBtn.click();
        alreadyContactWithOdooBtn.click();
        Select amNotSure = new Select(hostingTypeDropDown);
        amNotSure.selectByIndex(3);
        submitDemoScheduleInformationBtn.click();
        return false;
    }

    //   WebElement newCreatedAppointmentUsername = userName;
    public void deleteDemoMeeting() {
        cancelAppointmentBtn.click();
    }

    public void deleteAppointment() {
        waitInSeconds(2);
        if (userName.getText().contains("Harman")) {
            cancelAppointmentBtn.click();
            System.out.println("Appointment is deleted");
        }

    }

}

