package org.example.definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.EditCusPage;

public class EditCusDefinition {
    EditCusPage editCusPage=new EditCusPage();
    @Given("click on Edit customer option in SideBar")
    public void click_on_edit_customer_option_in_side_bar() {
        editCusPage.chooseEditCusOption();

    }

    @When("enter customer ID as {string}")
    public void enter_customer_id_as(String string) {
        editCusPage.enterCusID(string);

    }

    @When("click on Submit button on edit field")
    public void click_on_submit_button_on_edit_field() {
        editCusPage.clickSubmitBtn();

    }

}
