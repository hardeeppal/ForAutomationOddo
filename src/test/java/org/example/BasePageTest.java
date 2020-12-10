package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utility.PropertyFileUtility;

import java.io.IOException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BasePageTest {
    protected static final Logger LOG = LoggerFactory.getLogger(BasePageTest.class);
    protected static WebDriver browser;
    protected static WebDriverWait wdWait;
    SignInPage signInPage;


    public void iWait(WebDriver browser) {
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void waitInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println("Some interruption occurred here ..!");
        }
    }

//    @BeforeClass
//    public void doLogin() {
//        signInPage = PageFactory.initElements(browser, SignInPage.class);
//        waitInSeconds(2);
//        signInPage.doLogin();
//    }

    @BeforeTest
    public void setUp() throws IOException {
        LOG.info("reading property files");
        PropertyFileUtility.initializeBrowserProperties();
        PropertyFileUtility.getBrowser();
        System.setProperty(PropertyFileUtility.getBrowserProperties(), PropertyFileUtility.getBrowserDriverPath());
//        String downloadedVersionISForChromeIs = WebDriverManager.chromedriver().getDownloadedVersion();
//        System.out.println(downloadedVersionISForChromeIs);
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
        browser = new ChromeDriver();
//        browser = new FirefoxDriver();
        browser.get("https://www.odoo.com/");
//        signInPage = PageFactory.initElements(browser,SignInPage.class);
//        signInPage.doLogin();
        browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        browser.manage().window().maximize();
        wdWait = new WebDriverWait(browser, 10);

        LOG.info("creating driver");
        if (PropertyFileUtility.getTestRunLocation().equalsIgnoreCase("BrowserStack")) {
            String AUTOMATE_USERNAME = "harry";
            String AUTOMATE_ACCESS_KEY = "nirmalchand";
            String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
                    + "@hub-cloud.browserstack.com/wd/hub";
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("os_version", "Catalina");
            caps.setCapability("resolution", "1920x1080");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "86.0 beta");
            caps.setCapability("os", "OS X");
            browser = new RemoteWebDriver(new URL(URL), caps);

        } else if (PropertyFileUtility.getTestRunLocation().equalsIgnoreCase("SauceLabs")) {
            //add code according to Sauce Labs
            String AUTOMATE_USERNAME = "john.mird.qa7";
            String AUTOMATE_ACCESS_KEY = "27e268f1-ba50-423d-90e5-eda8570ee4d5";
            String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
                    + "@hub-cloud.browserstack.com/wd/hub";
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platfromName", "macOs 10:15");
            caps.setCapability("browserName", "chrome");
            caps.setCapability("browserVersion", "86.0 beta");
            browser = new RemoteWebDriver(new URL(URL), caps);
        } else if (PropertyFileUtility.getTestRunLocation().equalsIgnoreCase("Local")) {
            if (PropertyFileUtility.getBrowser().equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
//                browser = new ChromeDriver();
//                browser.get("https://www.odoo.com/");
//                browser.manage().window().maximize();

            } else if (browser == null) {
                LOG.error("broswer can not be null . something is wrong");
                System.exit(1);
            }

        } else {
            System.out.println("location is not defined in BroswerConfig.proopertiesFile and"
                    + " may be the function is not defined in PropertyFileUtils.java file in Utils folder");
            LOG.info("location is not defined in BroswerConfig.proopertiesFile and"
                    + " may be the function is not defined in PropertyFileUtils.java file in Utils folder");
        }
    }

    @FindBy(css = "button[class='o_social_push_notifications_permission_deny btn btn-light']")
    protected WebElement denyPopUpDialog;

    public void closePopUp() {
        try {
            denyPopUpDialog.click();
        } catch (NoSuchElementException elem) {
            System.out.println("No popUp Found");
        }
    }

    @AfterTest(enabled = false)
    public void tearDownBrowser() {
        waitInSeconds(5);
        browser.quit();
    }
}
