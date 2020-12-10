package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WriteForCommunityTest extends BasePageTest {
    WriteForCommunity writeForCommunity;

    @Test(priority = 12, enabled = true)
    public void writeForCommunityTest() {
        browser.get("https://www.odoo.com/");
        writeForCommunity = PageFactory.initElements(browser, WriteForCommunity.class);
        writeForCommunity.doWriteForCommunity();
    }
}
