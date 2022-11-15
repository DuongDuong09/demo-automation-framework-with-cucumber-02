package org.example.definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.example.pages.NewCusPage;
import org.example.pages.LogInPage;


public class LoginDefinition  {
    LogInPage logInPage= new LogInPage();
    @Given("User navigates to orangeHRM")
    public void user_navigates_to_orangeHRM() {
        System.out.println("Loading..........");
    }
    @When("I enter username as {string}")
    public void i_enter_username_as(String userName) {
        logInPage.enterUserID(userName);
    }
    @When("I enter password as {string}")
    public void i_enter_password_as(String password) {
        logInPage.enterPassword(password);
    }
    @When("I click Login button")
    public void i_click_Login_button() throws InterruptedException {
        logInPage.clickBtnLogIn();
        Thread.sleep(5000);
    }
    @Then("Login should fail")
    public void login_should_fail() {
        System.out.println("Login failed");
    }
    @Then("Login should success")
    public void login_should_success(){
        System.out.println("Login success");
    }
//    @After
//    public void afterScenario(){
//        System.out.println("This will run after the Scenario");
//    }
//    @Then("Relogin option should be available")
//    public void relogin_option_should_be_available()  {
//        if (driver.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test Failed");
//        }
//         driver.quit();
//    }
}
