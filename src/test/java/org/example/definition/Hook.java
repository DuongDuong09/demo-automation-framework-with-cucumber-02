package org.example.definition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.helpers.RecordVideo;
import org.example.pages.BasePage;
import org.example.pages.LogInPage;
import org.example.utils.PropertiesFileReader;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends BasePage {
    BasePage basePage = new BasePage();
    LogInPage logInPage = new LogInPage();

    @Before
    public void beforeScenario() throws Exception {
        RecordVideo.startRecord("CucumberRecord");
        PropertiesFileReader.loadAllFiles();
        basePage.initDriver(PropertiesFileReader.getValue("browser"));
        logInPage=basePage.gotoLoginPage();
    }

    @After
    public void afterScenario() throws Exception {
        System.out.println("Stop Driver in Hooks: " + basePage.getDriver());
        basePage.tearDown();
        RecordVideo.stopRecord();

    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) basePage.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot Failed");

        }
    }
}
