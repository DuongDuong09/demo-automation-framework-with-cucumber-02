package org.example.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.utils.PropertiesFileReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.example.listener.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static EventFiringWebDriver driver;
    static WebDriverWait wait;
    private static ThreadLocal<WebDriver> myThreadLocal = new ThreadLocal<>();
    public static final Logger logger= LogManager.getLogger(BasePage.class);

    public static WebDriver getDriver() {
        return myThreadLocal.get();
    }

    public static void remove() {
        myThreadLocal.remove();
    }
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    public void initDriver(String browserParameter) {
        switch (browserParameter) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new EventFiringWebDriver(new ChromeDriver());
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver =new EventFiringWebDriver( new FirefoxDriver());
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver =new EventFiringWebDriver( new EdgeDriver());
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver =new EventFiringWebDriver( new InternetExplorerDriver());
                break;
        }
        driver.register(new WebDriverEventHandle()) ;
        myThreadLocal.set(driver);
        wait = new WebDriverWait(getDriver(),Duration.ofSeconds(30));
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public void   initBrowserForSeleniumGrid(String browser) throws MalformedURLException {
        WebDriver driver;
        String url = "http://172.20.10.8:4444/";
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        if (browser.equals("chrome")) {
            desiredCapabilities.setBrowserName("chrome");
        } else if (browser.equals("firefox")) {
            desiredCapabilities.setBrowserName("firefox");
        } else if (browser.equals("edge")) {
            desiredCapabilities.setBrowserName("edge");
//            desiredCapabilities.setBrowserName(DesiredCapabilities.edge().getBrowserName());
            System.setProperty("webdriver.edge.driver","/resources/msedgedriver.exe");
        }
//        desiredCapabilities.setCapability("version", "107.0.5304.88");
        desiredCapabilities.setCapability("platform", "win10");
        desiredCapabilities.setCapability("video", true); // To enable video recording
//        desiredCapabilities.setBrowserName(DesiredCapabilities.edge().getBrowserName());
        desiredCapabilities.setCapability("acceptSslCerts", "true");
        driver = new RemoteWebDriver((new URL((url))), desiredCapabilities);
        myThreadLocal.set(driver);
        wait = new WebDriverWait(getDriver(),Duration.ofSeconds(30));
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        return getDriver();

    }
    public LogInPage gotoLoginPage() {
        getDriver().get(PropertiesFileReader.getValue("url"));
        return new LogInPage();
    }

    public void tearDown() {
        getDriver().quit();
        remove();
    }
}

