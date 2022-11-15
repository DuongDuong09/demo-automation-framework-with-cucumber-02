package org.example.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DeleteCusPage extends BasePage {
    private By headerDel = By.xpath("//p[@class='heading3']");
    private By deleteOption = By.xpath("(//a[contains(text(),'Delete Customer')])[2]");
    private By cuid = By.xpath("//input[@name='cusid']");
    private By submit=By.xpath("(//input[@name='AccSubmit'])[1]");
    private By reset = By.xpath("//input[@name='res']");

    public void isOnDeletePage() {
        Assert.assertTrue(getDriver().findElement(headerDel).isDisplayed());
        System.out.println(getDriver().findElement(headerDel).getText());
    }
    public void choose_option_DeleteCustomer(){
        if(getDriver().findElement(deleteOption).isDisplayed()){
            getDriver().findElement(deleteOption).click();
        }
    }
    public void enter_ID(String cuID){
        if(getDriver().findElement(cuid).isEnabled()){
            getDriver().findElement(cuid).sendKeys(cuID);
        }
    }
    public void submit(){
        if (getDriver().findElement(submit).isEnabled()){
            getDriver().findElement(submit).click();
        }
    }
}
