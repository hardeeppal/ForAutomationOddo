package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TourPage extends BasePage {

    @FindBy(css = "a[href='/page/tour']")
    protected WebElement email;

    @FindBy(css = "div[data-video-id='-FgcAUUsI7k'] > div[class='s_figure_link overflow-hidden ']")
    protected WebElement accountingVideo;

//    @FindBy(css = "div[class='ytp-cued-thumbnail-overlay'] > div")
    @FindBy(css = "div.ytp-cued-thumbnail-overlay > div[class='ytp-cued-thumbnail-overlay-image']")
    protected WebElement playVideo;

    @FindBy(css = "div[class='modal-header pt-0 pb-2 border-0'] > button[type='button']")
    protected WebElement closeVideo;

    public TourPage(WebDriver driver) {
        super(driver);
    }

    public void takeOddoTour() {
        email.click();
        accountingVideo.click();
        browser.switchTo().frame("date-20200911 en_US ltr exp-invert-logo exp-kevlar-settings exp-responsive exp-search-big-thumbs site-center-aligned site-as-giant-card webkit webkit-537 inverted-hdpi");
        playVideo.click();
        waitInSeconds(6);
        playVideo.click();
        closeVideo.click();
    }
}
