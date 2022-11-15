Feature: Delete Customer

  Background: Login success
    Given User navigates to orangeHRM
    When I enter username as "mngr450923"
    And I enter password as "qYgUhAq"
    And I click Login button
    Then Login should fail

  Scenario: Delete Customer
    Given click on Delete Customer option in sidebar
    Then I enter customer ID as "11111"
    And click on Submit button on delete page