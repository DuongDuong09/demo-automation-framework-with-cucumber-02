package org.example.tests;

import org.example.pages.BasePage;
import org.example.pages.LogInPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.example.listener.*;
import org.example.helpers.*;

@Listeners({ReportListener.class})
public class BaseTest {
    BasePage basePage=new BasePage();
    LogInPage logInPage=new LogInPage();
    @BeforeTest
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browser) throws Exception {
        RecordVideo.startRecord("ManageDocument");
        basePage.initDriver(browser);
//        basePage.initBrowserForSeleniumGrid(browser);
        logInPage = basePage.gotoLoginPage();
    }
    @AfterTest
    public void tearDown() throws Exception {
        basePage.tearDown();
        RecordVideo.stopRecord();
    }

}
