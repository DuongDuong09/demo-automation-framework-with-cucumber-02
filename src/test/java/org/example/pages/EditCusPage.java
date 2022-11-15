package org.example.pages;


import org.openqa.selenium.By;

public class EditCusPage extends BasePage{
    private By editCusOption=By.xpath("//a[contains(text(),'Edit Customer')]");
    private By cusID=By.xpath("//input[@name='cusid']");
    private By submitBtn=By.xpath("//input[@name='AccSubmit']");
    private By resetBtn=By.xpath("//input[@name='res']");
    public void chooseEditCusOption(){
        if(getDriver().findElement(editCusOption).isDisplayed()){
            getDriver().findElement(editCusOption).click();
        }
    }
    public void enterCusID(String arg){
        if(getDriver().findElement(cusID).isEnabled()){
            getDriver().findElement(cusID).sendKeys(arg);
        }
    }
    public void clickSubmitBtn(){
        if(getDriver().findElement(submitBtn).isDisplayed()){
            getDriver().findElement(submitBtn).click();
        }
    }
}
