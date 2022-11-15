Feature: Amount Deposit Form
  Background: Login success
    Given User navigates to orangeHRM
    When I enter username as "mngr450923"
    And I enter password as "qYgUhAq"
    And I click Login button
    Then Login should fail
Scenario: Fill out Deposit form
  Given  navigates to Deposit Page
  When I enter account number as "123456"
  And I enter amount number as "100"
  And I enter description as "number is invalid"
  Then click on Submit button on deposit page