package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyDataBase extends BasePage {
    public MyDataBase(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[class='dropdown-toggle']")
    protected WebElement dropDown;

    @FindBy(css = "a[href='/my/databases']")
    protected WebElement myDatabases;

//    @FindBy(css = "a[href='https://electric15.odoo.com/web']")
//    protected WebElement connectToAccount;
    @FindBy(css = "a[href='/page/start']")
    protected WebElement createNewDataBaseMenu;

    public void accessMyDatabase() {
        dropDown.click();
        myDatabases.click();
        createNewDataBaseMenu.click();
    }


}
