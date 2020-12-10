package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SalesPiplinePage extends BasePage {
    public SalesPiplinePage(WebDriver driver) {
        super(driver);
    }


    // First have to login to an account
    // click on my profile
    // click on myDatabases
    //

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

    @FindBy(css = "a[data-action-id='170'] div[class='o_app_icon']")
    protected WebElement CRMBtn;

    @FindBy(css = "button[class='btn btn-primary o-kanban-button-new']")
    protected WebElement createPipelineBtn;

    @FindBy(css = "input[name='name']")
    protected WebElement idInputField;

//    @FindBy(css = "a[data-action-id='170'] div[class='o_app_icon']")
//    protected WebElement idInput;


    @FindBy(css = "td > div[class='o_field_widget o_field_many2one']  >div > input[class='o_input ui-autocomplete-input']")
    protected WebElement customerName;

    @FindBy(css = "div[data-id='3']")
    protected WebElement normalClick;

    @FindBy(css = "#modal_154 > div > div > footer > button:nth-child(1) > span")
    protected WebElement confirmCreateBtn;

    @FindBy(css = ".o_field_monetary.o_field_number.o_input.o_field_widget > input")
    protected WebElement revenueInputField;

    @FindBy(css = "div >button[class='btn btn-primary o_kanban_add']")
    protected WebElement addBtn;
    @FindBy(css = "#modal_167 > div > div > footer > button:nth-child(1) > span")
    protected WebElement createBtn;

    @FindBy(css = "div[class='o_dropdown_kanban dropdown']")
    List<WebElement> allUsers;

    @FindBy(css = "li[class='o-selection-focus'] > a")
    protected WebElement searchOption;

    @FindBy(css = "div[class='o_kanban_group o_kanban_no_records ui-sortable o_kanban_has_progressbar']")
    protected WebElement threeDots;

    @FindBy(css = "div > div.o_dropdown_kanban.dropdown.show > div > a:nth-child(2)")
    protected WebElement deleteOption;

    @FindBy(css = "button[class='btn btn-primary']")
    protected WebElement confirmDeleteBtn;

    @FindBy(css = "ul[class='o_menu_sections']")
    protected WebElement reportingMenu;

    @FindBy(css = "li[class='show'] a[href='#menu_id=139&action=186']")
    protected WebElement pipelineMenu;

    @FindBy(css = "button[class='btn fa fa-area-chart o_graph_button btn-outline-secondary']")
    protected WebElement lineChartMenu;




    public void createNewPipeline() {
        dropDown.click();
        myDatabases.click();
        connectBTN.click();
        emailInputField.sendKeys("hardeepmtl@gmail.com");
        passwordField.sendKeys("Gmail123");
        submitBtn.click();
        waitInSeconds(2);
        CRMBtn.click();

//        createPipelineBtn.click();
//        idInputField.sendKeys("John");
//        waitInSeconds(2);
////        idInput.sendKeys("2332");
//        customerName.sendKeys("Harryeef");
//        normalClick.click();
//        confirmCreateBtn.click();
//        revenueInputField.sendKeys("22232");
//        addBtn.click();
    }

    // pipeline logo for Assert $$("li[class='breadcrumb-item active']")

    // Create Pipline  "button[class='btn btn-primary o-kanban-button-new']");

    // Customer Name input fieldid="o_field_input_750"
    // Expected Revenue input field id="o_field_input_751"
    //  Add Button $$("div >button[class='btn btn-primary o_kanban_add']")
    public String addUser(String name) {
        createPipelineBtn.click();
        idInputField.sendKeys(name);
        waitInSeconds(2);
//        idInput.sendKeys("2332");
        customerName.sendKeys(name);
        normalClick.click();
        waitInSeconds(4);
//        confirmCreateBtn.click();
//        revenueInputField.sendKeys("22232");
//        addBtn.click();
        createBtn.click();
        return name;
    }

//    public void deleteUser(String name) {
//        for (WebElement currentUser : allUsers) {
//            WebElement nameElement = currentUser.findElement(By.cssSelector("input[class='o_searchview_input']"));
//            if (nameElement.getText().contains(name)) {
//                WebElement userToBeDeleted = nameElement.findElement(By.cssSelector("span[class='o_searchview_more fa fa-search-minus']"));
//                searchOption.click();
//                waitInSeconds(2);
//                userToBeDeleted.click();
//                waitInSeconds(2);
//                threeDots.click();
//                waitInSeconds(2);
//                deleteOption.click();
//                waitInSeconds(6);
//                confirmDeleteBtn.click();
//            }
//        }
//    }

//
//    public void selectUser(String fname, String lname) {
//
//        for (WebElement currentUser : listofExistingUsers) {
//            if (currentUser.getText().contains(fname) && currentUser.getText().contains(lname)) {
//                currentUser.click();
//                System.out.println("user is selected to change status");
//                break;
//            }
//        }
//
//    }

    public void deletePipeline() {

    }
    public void createCRMReports() {
       reportingMenu.click();
       pipelineMenu.click();
       lineChartMenu.click();

    }
}
