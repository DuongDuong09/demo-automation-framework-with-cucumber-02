package org.example.definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.DepositPage;

public class DepositDefinition {
    DepositPage depositPage=new DepositPage();
    @Given("navigates to Deposit Page")
    public void navigates_to_deposit_page() {
        depositPage.click_deposit_option();
        depositPage.isOnDepositPage();

    }

    @When("I enter account number as {string}")
    public void i_enter_account_number_as(String string) {
        depositPage.enter_acountNo(string);
    }

    @When("I enter amount number as {string}")
    public void i_enter_amount_number_as(String string) {
        depositPage.enter_amount(string);
    }

    @When("I enter description as {string}")
    public void i_enter_description_as(String string) {
        depositPage.enter_description(string);
    }

    @Then("click on Submit button on deposit page")
    public void click_on_submit_button_on_deposit_page() {
        depositPage.click_On_submit();
    }
}
