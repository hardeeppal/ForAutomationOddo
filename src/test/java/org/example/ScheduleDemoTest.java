package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScheduleDemoTest extends BasePageTest {
    ScheduleDemo scheduleDemo;
    SignInPage signInPage;

    @Test(priority = 13, enabled = true)
    public void scheduleDemoTest() {
        browser.get("https://www.odoo.com/");
// When i run by regression i need to come to oddo website again
//        signInPage = PageFactory.initElements(browser, SignInPage.class);
//        signInPage.doLogin();
        signInPage = PageFactory.initElements(browser, SignInPage.class);
        signInPage.doLogin();
        scheduleDemo = PageFactory.initElements(browser, ScheduleDemo.class);
        scheduleDemo.scheduleDemo();
//        Assert.assertTrue(scheduleDemo.demoMeetingScheduleVisibleText.isDisplayed());
        scheduleDemo.deleteAppointment();
        waitInSeconds(2);
        String messageaftercancelbutton = browser.findElement(By.cssSelector("#popup-content > p")).getText();
        waitInSeconds(2);
        Assert.assertEquals(messageaftercancelbutton, "Are you sure you want to cancel this appointment?");
        browser.findElement(By.cssSelector("#confirm-cancel")).click();
        String messageaftercancelapp = browser.findElement(By.cssSelector("#appointment-form > div.alert.alert-success.dynamic-alert > span")).getText();

        Assert.assertEquals(messageaftercancelapp, "Your appointment has been canceled");
    }
    }
