package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.NoSuchElementException;

public abstract class BasePage {
//    protected static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    protected WebDriver browser;
    protected JavascriptExecutor jse;
    protected Actions mkbActions;
    protected WebDriverWait wdWait;

    public BasePage(WebDriver driver) {
        browser = driver;
        wdWait = new WebDriverWait(browser, 20);
        jse = (JavascriptExecutor) browser;
        mkbActions = new Actions(browser);
    }

    @FindBy(css = "button[class='o_social_push_notifications_permission_deny btn btn-light']")
    protected WebElement denyPopUpDialog;
    public void closePopUp() {
        waitInSeconds(1);
        try {
            denyPopUpDialog.click();
        } catch (NoSuchElementException elem) {
            System.out.println("No popUp Found");
        }
    }
    public void clickOnElement(WebElement selector) {
       selector.click();
    }

    public void clickOnElementUsingJse(WebElement element) {
        jse.executeScript("argument[0],click();", element);
    }

    public void clickOnElementUsingCss(WebElement selector) {
        jse.executeScript("document.querySelector(argument[0])[0].click();", selector);
    }

    public void scrollIntoViewUsingJse(WebElement element) {
        jse.executeScript("arguments[0].scrollIntoView()", element);
    }

    public void clickOnElementUsingMkbAction(WebElement element) {
        mkbActions.moveToElement(element).click().perform();
    }

    public String title() {
        return browser.getTitle();
    }

    public String getUrl() {
        return browser.getCurrentUrl();
    }

    public static void waitInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println("Some interruption occurred here ..!");
        }
    }

    public void switchToWindow() {
        String browserId = browser.getWindowHandle();
        browser.switchTo().window(browserId);
    }
    public void ExplicitWaitByCss(WebElement selector) {
        wdWait.until(ExpectedConditions.elementToBeClickable(selector));
    }

//    public static void closePushNotification(WebDriver browser) {
//        try {
//            browser.findElement(By.cssSelector("a[class='o_thread_window_close fa fa-close']"));
//        } catch ()
//    }

    // It will return the parent window name as a String


//    String parent = browser.getWindowHandle();
//    Set<String> s = browser.getWindowHandles();
//    // Now iterate using Iterator
//    Iterator<String> I1 = s.iterator();
//    while(I1.())
//
//    {
//        String child_window = I1.next();
//        if (!parent.equals(child_window)) {
//            browser.switchTo().window(child_window);
//            System.out.println(browser.switchTo().window(child_window).getTitle());
//            browser.close();
//        }
//    }
////switch to the parent window
//driver.switchTo().
//
//    window(parent);

//    public void starOfServicesViewTest() {
//        browser.get();
//        WebElement photographyHeader = browser.findElement()
//        System.out.println("beforeScrolledIntoView" + photographyHeader.isDisplayed());
//        WebElement photographyLink = browser.findElement(B);
//        photographyLink.click();
//        System.out.println("AfterScrolledToView" + photographyHeader.isDisplayed());
//
//    }
//
//    public  boolean isElementInView(WebElement element) {
//        Dimension dimension = browser.manage().window().getSize();
//        int windowHeight = dimension.getHeight();
//        int elemWidth = dimension.width;
//        Point elemLocation = element.getLocation();
//        int elmCordinate = elemLocation.getX();
//        int elmCOrdinateY = elemLocation.getY();
//
//        System.out.println("");
//    }


}
//    public boolean isThePopPresent(String selector) {
//        try {
//            WebElement element = null;
//            WebElement element = browser.findElement(By.cssSelector(selector));
//            if (element != null) {
//                found =
//            }
//        } // using two types css or path if selector is true change give present or not

//        return false;

//    public void explicitWaitForPresenceOfAnId(String id) {
//        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
//    }
//    public void explicitWaitForPresenceOfElementByCss(String cssSelector) {
//        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssSelector)));
//    }


