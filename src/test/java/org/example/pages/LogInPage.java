package org.example.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LogInPage extends BasePage {
    private final By userID = By.name("uid");
    private final By password = By.name("password");
    private final By btnLogIn = By.name("btnLogin");
    private final By btnReSet = By.name("btnReset");
    public boolean isOnLoginPage() {
        return getDriver().findElement(userID).isEnabled();
    }
    public void enterUserID(String userid) {
//        Assert.assertTrue(getDriver().findElement(userID).getText()=="no");
        getDriver().findElement(userID).sendKeys(userid);
    }

    public void enterPassword(String passwd) {
        if (getDriver().findElement(password).isDisplayed()) {
            getDriver().findElement(password).sendKeys(passwd);
        }
    }
    public void clickBtnLogIn() {
        if (getDriver().findElement(btnLogIn).isEnabled()) {
            getDriver().findElement(btnLogIn).click();
        }

    }
    public void clickBtnReSet() {
        if (getDriver().findElement(btnReSet).isEnabled()) {
            getDriver().findElement(btnReSet).click();
        }
    }
}
