package org.example.tests;

import org.testng.annotations.Test;

public class LogInTest extends BaseTest{

    @Test()
    public void check_SignIn_Page(){
        logInPage.isOnLoginPage();
    }
    @Test(priority = 1)
    public void enter_userId() {
        logInPage.enterUserID("mngr450923");
    }
    @Test(priority = 2)
    public void enter_password() {
        logInPage.enterPassword("qYgUhAq");
    }
    @Test(dependsOnMethods = {"enter_password"})
    public void click_submit(){
        logInPage.clickBtnLogIn();
    }
}
