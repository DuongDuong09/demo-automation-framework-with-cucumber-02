package org.example.tests;

import org.example.pages.DepositPage;
import org.example.utils.ExcelFileReader;
import org.testng.annotations.Test;

public class DepositTest extends BaseTest{
    DepositPage depositPage=new DepositPage();

    @Test(priority = 1)
    public void isOnDepositPage(){
        depositPage.click_deposit_option();
    }
    @Test(priority = 2)
    public void enter_AccountNo() throws Exception {
        depositPage.enter_acountNo( ExcelFileReader.excelReader("ACCOUNT NUMBER",1));
    }
    @Test(priority = 3)
    public void enter_Amount() throws Exception {
        depositPage.enter_amount(ExcelFileReader.excelReader("AMOUNT",1));
    }
    @Test(priority = 4)
    public void enter_Description() throws Exception {
        depositPage.enter_description(ExcelFileReader.excelReader("DESCRIPTION",1));
    }
    @Test(priority = 5)
    public void click_Submit(){

    }
}
