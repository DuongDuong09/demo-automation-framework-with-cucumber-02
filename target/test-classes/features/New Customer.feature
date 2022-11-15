Feature: Add new Customer
  Background: Login success
    Given User navigates to orangeHRM
    When I enter username as "mngr450923"
    And I enter password as "qYgUhAq"
    And I click Login button
    Then Login should fail

  Scenario: Add new customer
    Given click on Add customer option in SideBar
    When I enter name as "Duong"
    And I choose gender
    And I enter date of birth "12/12/1999"
    And I enter address "BC"
    And I enter city "Ho Chi Minh city"
    And I enter state "Viet Nam"
    And I enter pin "123457"
    And I enter phone "09090808055"
    And I enter email "abc12345600@gmail.com"
    And I enter password in add new customer as "passwd12345"
    Then click on Submit button
