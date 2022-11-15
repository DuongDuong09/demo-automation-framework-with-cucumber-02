package org.example.pages;

import org.openqa.selenium.By;


public class NewCusPage extends BasePage {
    private By header=By.xpath("//h2[@class='barone']");
    private By new_Customer=By.xpath("//a[normalize-space()='New Customer']");
    private By name=By.xpath("//input[@name='name']");
    private By gender=By.xpath("(//input[@name='rad1'])[2]");
    private By date_of_birth=By.xpath("(//input[@name='dob'])");
    private By addr=By.xpath("(//textarea[@name='addr'])");
    private By city=By.xpath("(//input[@name='city'])");
    private By state=By.xpath("(//input[@name='state'])");
    private By pin=By.xpath("(//input[@name='pinno'])");
    private By phone=By.xpath("(//input[@name='telephoneno'])");
    private By email=By.xpath("//input[@name='emailid']");
    private By password=By.xpath("//input[@name='password']");
    private By submit=By.xpath("//input[@type='submit']");
    private By reset=By.xpath("//input[@type='reset']");
    public void click_newCustomerBtn(){
        getDriver().findElement(new_Customer).click();
    }
    public void enter_Name(String  nname){
        getDriver().findElement(name).sendKeys(nname);
    }
    public void choose_gender(){
        getDriver().findElement(gender).click();
    }
    public void enter_Date_of_birth(String dob){
        getDriver().findElement(date_of_birth).sendKeys(dob);
    }
    public void enter_address(String add){
        getDriver().findElement(addr).sendKeys(add);
    }
    public void enter_city(String ccity){
        getDriver().findElement(city).sendKeys(ccity);
    }
    public void enter_state(String sstate){
        getDriver().findElement(state).sendKeys(sstate);
    }
    public void enter_pin(String ppin){
        getDriver().findElement(pin).sendKeys(ppin);
    }
    public void enter_phone(String pphone){
        getDriver().findElement(phone).sendKeys(pphone);
    }
    public void enter_email(String eemail){
        getDriver().findElement(email).sendKeys(eemail);
    }
    public void enter_password(String passwd){
        getDriver().findElement(password).sendKeys(passwd);
    }
    public void click_Submit(){
        getDriver().findElement(submit).click();
    }
}
