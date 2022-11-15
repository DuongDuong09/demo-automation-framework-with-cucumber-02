Feature: Add new Customer

  Background: Login Success
    Given User navigates to orangeHRM
    When I enter username as "mngr450923"
    And I enter password as "qYgUhAq"
    And I click Login button
    Then Login should success

  Scenario: Edit Customer
    Given click on Edit customer option in SideBar
    When enter customer ID as "59065"
    And click on Submit button on edit field

  Scenario: Edit Customer fail
    Given click on Edit customer option in SideBar
    When enter customer ID as "11111"
    And click on Submit button on edit field