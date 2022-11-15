package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


import org.testng.Assert;

public class DepositPage extends BasePage {

    private By depositOption = By.xpath("//a[text()='Deposit']");
    private By accountNo = By.xpath("//input[@name='accountno']");
    private By amount = By.xpath("//input[@name='ammount']");
    private By description = By.xpath("//input[@name='desc']");
    private By submit = By.xpath("//input[@name='AccSubmit']");

    public void click_deposit_option() {
//        js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(depositOption));
        getDriver().findElement(depositOption).click();
    }

    public boolean isOnDepositPage() {
        Assert.assertTrue(getDriver().findElement(amount).isDisplayed());
        return true;
    }

    public void enter_acountNo(String accountno) {
        if (getDriver().findElement(accountNo).isDisplayed()) {
            getDriver().findElement(accountNo).sendKeys(accountno);
        }
    }

    public void enter_amount(String amountt) {
        if (getDriver().findElement(amount).isDisplayed()) {
            getDriver().findElement(amount).sendKeys(amountt);
        }
    }

    public void enter_description(String descriptionn) {
        if (getDriver().findElement(description).isDisplayed()) {
            getDriver().findElement(description).sendKeys(descriptionn);
        }
    }

    public void click_On_submit() {
        if (getDriver().findElement(submit).isDisplayed()) {
            getDriver().findElement(submit).click();
        }
    }
}
