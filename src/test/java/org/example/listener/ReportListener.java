package org.example.listener;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import io.qameta.allure.Attachment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.pages.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.example.extent_report.*;
import java.io.PrintStream;

public class ReportListener implements ITestListener {
    WebDriver driver;
    public static final Logger Logging = LogManager.getLogger(ReportListener.class);

    public ReportListener() {
    }

    public String getTestName(ITestResult result) {
        return result.getTestName() != null ? result.getTestName() : result.getMethod().getConstructorOrMethod().getName();
    }

    public static void addScreenShot(Status status, String message) {
        TakesScreenshot var10000 = (TakesScreenshot) BasePage.getDriver();
        String base64Image = "data:image/png;base64," + (String)var10000.getScreenshotAs(OutputType.BASE64);
        ExtentTestManager.getTest().log(status, message, (Media)ExtentTestManager.getTest().addScreenCaptureFromPath(base64Image).getModel().getMedia().get(0));
    }

    @Attachment(
            value = "{0}",
            type = "text/plain"
    )
    public static String saveTextLog(String message) {
        return message;
    }

    @Attachment(
            value = "{0}",
            type = "text/html"
    )
    public static String attachHtml(String html) {
        return html;
    }

    @Attachment(
            value = "Page screenshot",
            type = "image/png"
    )
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return (byte[])((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    public String getTestDescription(ITestResult result) {
        return result.getMethod().getDescription() != null ? result.getMethod().getDescription() : this.getTestName(result);
    }

    public void onTestStart(ITestResult iTestResult) {
        Logger var10000 = Logging;
        String var10001 = this.getTestName(iTestResult);
        var10000.error(var10001 + " test is starting...");
        ExtentTestManager.saveToReport(iTestResult.getName(), iTestResult.getTestName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        Logger var10000 = Logging;
        String var10001 = this.getTestName(iTestResult);
        var10000.error(var10001 + " test is passed...");
        ExtentTestManager.logMessage(Status.PASS, this.getTestDescription(iTestResult));
    }

    public void onFinish(ITestContext context) {
        Logging.error("Test execution is finished");
        ExtentManager.getExtentReports().flush();
    }

    public void onTestFailure(ITestResult iTestResult) {
        Logger var10000 = Logging;
        String var10001 = this.getTestName(iTestResult);
        var10000.error(var10001 + " test is failed...");
        ExtentTestManager.logMessage(Status.FAIL, this.getTestDescription(iTestResult));
        addScreenShot(Status.FAIL, this.getTestName(iTestResult));
        var10000 = Logging;
        var10001 = this.getTestName(iTestResult);
        var10000.error("Screenshot captured for test case: " + var10001);
        if (this.driver != null) {
            PrintStream var2 = System.out;
            var10001 = this.getTestName(iTestResult);
            var2.println("Screenshot captured for test case:" + var10001);
            this.saveScreenshotPNG(this.driver);
        }

        String var3 = this.getTestName(iTestResult);
        saveTextLog(var3 + " failed and screenshot taken!");
    }

    public void onTestSkipped(ITestResult iTestResult) {
        Logger var10000 = Logging;
        String var10001 = this.getTestName(iTestResult);
        var10000.error(var10001 + " test is skipped...");
        Status var2 = Status.SKIP;
        var10001 = this.getTestName(iTestResult);
        ExtentTestManager.logMessage(var2, var10001 + " test is skipped.");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        Logger var10000 = Logging;
        String var10001 = this.getTestName(iTestResult);
        var10000.error("Test failed but it is in defined success ratio " + var10001);
        String var2 = this.getTestName(iTestResult);
        ExtentTestManager.logMessage("Test failed but it is in defined success ratio " + var2);
    }
}
