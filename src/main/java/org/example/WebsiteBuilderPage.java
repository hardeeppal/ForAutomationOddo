package org.example;

import org.openqa.selenium.WebDriver;

public class WebsiteBuilderPage extends AppsDropDownPage {
    public WebsiteBuilderPage(WebDriver driver) {
        super(driver);
    }

    public void display() {
        System.out.println("Am reached at website builder page");
    }
}
