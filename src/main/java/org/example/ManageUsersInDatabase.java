package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ManageUsersInDatabase extends BasePage {
    public ManageUsersInDatabase(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[class='dropdown-toggle']")
    protected WebElement dropDown;

    @FindBy(css = "a[href='/my/databases']")
    protected WebElement myDatabases;

    @FindBy(css = "a[href='https://electric15.odoo.com/web']")
    protected WebElement connectBTN;

    @FindBy(name = "login")
    protected WebElement emailInputField;

    @FindBy(id = "password")
    protected WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    protected WebElement submitBtn;

    @FindBy(css = "a:nth-child(6) > div.o_app_icon")
    protected WebElement settingMenu;


    @FindBy(css = "#invite_users i[class=\"fa fa-fw o_button_icon fa-arrow-right\"] + span")
    protected WebElement manageUserMenu;

    @FindBy(css = "tr.o_data_row > td:nth-child(2)")
    protected WebElement userList;

    @FindBy(css = "button.btn.btn-primary.o_form_button_edit")
    protected WebElement editUserButton;

    @FindBy(css = "button.fa.fa-pencil.fa-lg.float-left.o_select_file_button")
    protected WebElement editUserPhoto;


    //    @FindBy(css = "a[href='https://electric15.odoo.com/web']")
//    protected WebElement connectToAccount;
    @FindBy(css = "a[href='/page/start']")
    protected WebElement createNewDataBaseMenu;


    public void myUsers() {
        dropDown.click();
        myDatabases.click();
        createNewDataBaseMenu.click();
        dropDown.click();
        myDatabases.click();
        connectBTN.click();
        emailInputField.sendKeys("hardeepmtl@gmail.com");
        passwordField.sendKeys("Gmail123");
        submitBtn.click();
        settingMenu.click();
        manageUserMenu.click();
    }

    public void uploadProfilePicture() throws AWTException {
        userList.click();
        editUserButton.click();
        editUserPhoto.click();
        Robot robot = new Robot();
        robot.setAutoDelay(2000);
        // Now am setting the path where i want to choose from a file what i want to upload a path as string
        StringSelection stringSelection = new StringSelection("/Users/hardeepkainth/A.jpg");
        // now i want to upload that into a clipboard StringSelection Holding a path as a string ToolKit is = Control+C
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//        // Now i will pasted
//        robot.setAutoDelay(2000);
//        // I will use key control  and will use key control v
//        // Am Pressing here the key
//
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        // Here am Releasing the keys
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.setAutoDelay(2000);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_META);

        robot.keyPress(KeyEvent.VK_TAB);

        robot.keyRelease(KeyEvent.VK_META);

        robot.keyRelease(KeyEvent.VK_TAB);

        robot.delay(500);

//Open Goto window

        robot.keyPress(KeyEvent.VK_META);

        robot.keyPress(KeyEvent.VK_SHIFT);

        robot.keyPress(KeyEvent.VK_G);

        robot.keyRelease(KeyEvent.VK_META);

        robot.keyRelease(KeyEvent.VK_SHIFT);

        robot.keyRelease(KeyEvent.VK_G);

//Paste the clipboard value

        robot.keyPress(KeyEvent.VK_META);

        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_META);

        robot.keyRelease(KeyEvent.VK_V);

//Press Enter key to close the Goto window and Upload window

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.delay(500);

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
