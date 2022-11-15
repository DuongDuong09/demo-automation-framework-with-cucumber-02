package org.example.tests;

import org.example.pages.DeleteCusPage;
import org.testng.annotations.Test;

public class DeleteCusTest extends BaseTest {
    DeleteCusPage deleteCusPage=new DeleteCusPage();
    @Test()
    public void isOnDeletePage(){
        deleteCusPage.choose_option_DeleteCustomer();

    }
    @Test(dependsOnMethods = {"isOnDeletePage"})
    public void enter_CusId(){
        deleteCusPage.enter_ID("123456");
    }
    @Test(dependsOnMethods = {"enter_CusId"})
    public void click_on_submit(){
        deleteCusPage.submit();
    }
}
