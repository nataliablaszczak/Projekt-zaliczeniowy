Feature: Login to account

  Scenario: User can login to already created account
    Given I'm on a mystore main page
    When I sign in
    And I enter email "test@test.pl" and password "Hasło1234#@!"
    Then I'm on Your account page
    And I close browser
