package org.example.definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.NewCusPage;

public class NewCusDefinition {
    NewCusPage addNewCusPage= new NewCusPage();
    @Given( "click on Add customer option in SideBar")
    public void click_on_customer_option(){
        addNewCusPage.click_newCustomerBtn();
        }
    @When("I enter name as {string}")
    public void enter_name(String name){
        addNewCusPage.enter_Name(name);
    }
    @And("I choose gender")
    public void choose_gender(){
        addNewCusPage.choose_gender();
    }
    @And ("I enter date of birth {string}")
    public void enter_date_of_birth(String dob){
        addNewCusPage.enter_Date_of_birth(dob);
    }
    @And ("I enter address {string}")
    public void enter_address(String addr){
        addNewCusPage.enter_address(addr);
    }
    @And ("I enter city {string}")
    public void enter_city(String city){
        addNewCusPage.enter_city(city);
    }
    @And ("I enter state {string}")
    public void enter_state(String state){
        addNewCusPage.enter_state(state);
    }
    @And ("I enter pin {string}")
    public void enter_pin(String pin){
        addNewCusPage.enter_pin(pin);
    }
    @And ("I enter phone {string}")
    public void enter_phone(String phone){
        addNewCusPage.enter_phone(phone);
    }
    @And ("I enter email {string}")
    public void enter_email(String email){
        addNewCusPage.enter_email(email);
    }
    @And("I enter password in add new customer as {string}")
    public void iEnterPasswordInAddNewCustomerAs(String arg0) {
        addNewCusPage.enter_password(arg0);
    }
    @Then("click on Submit button")
    public void clickOnSubmitButton() {
        addNewCusPage.click_Submit();
    }
}
