package org.example.listener;

import io.qameta.allure.Attachment;
import org.example.pages.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends BasePage implements ITestListener {
    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
    //Text attachments for Allure
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    //Text attachments for Allure
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }

    //HTML attachments for Allure
    @Attachment(value = "{0}", type = "text/html")
    public static String attachHtml(String html) {
        return html;
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        logger.info("I am in onStart method " + iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        logger.info("I am in onFinish method " + iTestContext.getName());
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        logger.info(getTestMethodName(iTestResult) + " test is starting.");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        logger.info(getTestMethodName(iTestResult) + " test is succeed.");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        logger.info(getTestMethodName(iTestResult) + " test is failed.");
        //Allure ScreenShotRobot and SaveTestLog
        if (getDriver() != null) {
            System.out.println("Screenshot captured for test case:" + getTestMethodName(iTestResult));
            saveScreenshotPNG(getDriver());
        }
        //Save a log on allure.
        saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken!");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        logger.info(getTestMethodName(iTestResult) + " test is skipped.");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        logger.info("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }
}
