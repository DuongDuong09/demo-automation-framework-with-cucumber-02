package org.example.tests;

import org.example.pages.NewCusPage;
import org.example.utils.JSONFileReader;
import org.testng.annotations.Test;

import java.io.IOException;

public class NewCusTest extends BaseTest {
    NewCusPage newCusPage=new NewCusPage();
    JSONFileReader jsonFileReader=new JSONFileReader();

    @Test(priority = 1)
    public void click_AddNewCustomer_option(){
        newCusPage.click_newCustomerBtn();
    }
    @Test(priority = 2)
    public void enterName() throws IOException {
        newCusPage.enter_Name(jsonFileReader.getEmployeeInfoByNumber("1").getName());
    }
    @Test(priority = 3)
    public void choose_gender(){
        newCusPage.choose_gender();
    }
    @Test(priority = 4)
    public void enter_Date_of_birth() throws IOException {
        newCusPage.enter_Date_of_birth(jsonFileReader.getEmployeeInfoByNumber("1").getBirthdate());
    }
    @Test(priority = 5)
    public void enter_address() throws IOException {
        newCusPage.enter_address(jsonFileReader.getEmployeeInfoByNumber("1").getAddress());
    }
    @Test(priority = 6)
    public void enter_city() throws IOException {
        newCusPage.enter_city(jsonFileReader.getEmployeeInfoByNumber("1").getCity());
    }
    @Test(priority = 7)
    public void enter_state() throws IOException {
        newCusPage.enter_state(jsonFileReader.getEmployeeInfoByNumber("1").getState());
    }
    @Test(priority = 8)
    public void enter_pin() throws IOException {
        newCusPage.enter_pin(jsonFileReader.getEmployeeInfoByNumber("1").getPin());
    }
    @Test(priority = 9)
    public void enter_phone() throws IOException {
        newCusPage.enter_phone(jsonFileReader.getEmployeeInfoByNumber("1").getPhone());
    }
    @Test(priority = 10)
    public void enter_email() throws IOException {
        newCusPage.enter_email(jsonFileReader.getEmployeeInfoByNumber("1").getEmail());
    }
    @Test(priority =11 )
    public void enter_password() throws IOException {
        newCusPage.enter_password(jsonFileReader.getEmployeeInfoByNumber("1").getPassword());
    }
    @Test(priority = 12)
    public void enter_Submit(){
        newCusPage.click_Submit();
    }
}
