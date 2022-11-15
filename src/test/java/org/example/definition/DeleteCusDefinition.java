package org.example.definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.DeleteCusPage;

public class DeleteCusDefinition {
    DeleteCusPage deleteCusPage = new DeleteCusPage();

    @Given("click on Delete Customer option in sidebar")
    public void click_on_delete_customer_option_in_sidebar() {
        deleteCusPage.isOnDeletePage();
        deleteCusPage.choose_option_DeleteCustomer();
    }

    @Then("I enter customer ID as {string}")
    public void i_enter_customer_id_as(String string) {
        deleteCusPage.enter_ID(string);
    }

    @And("click on Submit button on delete page")
    public void click_on_submit_button_on_delete_page() {
        deleteCusPage.submit();
    }

}
