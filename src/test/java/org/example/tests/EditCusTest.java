package org.example.tests;

import org.example.pages.EditCusPage;
import org.example.utils.PropertiesFileReader;
import org.testng.annotations.Test;

public class EditCusTest extends BaseTest{
    EditCusPage editCusPage=new EditCusPage();
    @Test
    public void choose_EditCustomer_option(){
        editCusPage.chooseEditCusOption();
    }
    @Test(dependsOnMethods = {"choose_EditCustomer_option"})
    public void enterCustomerId(){
        editCusPage.enterCusID(PropertiesFileReader.getValue("customerID"));
    }
    @Test(dependsOnMethods = {"enterCustomerId"})
    public void clickOnSubmitBtn(){
        editCusPage.clickSubmitBtn();
    }
}
