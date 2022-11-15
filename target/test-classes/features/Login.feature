Feature: Login fail

  Scenario Outline: Login failed
    Given User navigates to orangeHRM
    When I enter username as "<nUser>"
    And I enter password as "<password>"
    And I click Login button
    Then Login should fail
    Examples: Page titles
      | nUser | password |
      | Admin | admin123 |
      |firstU | passwdU  |