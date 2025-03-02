Feature: Login to account and create new address

  Scenario: User can login to already created account and create new address
    Given I'm on a mystore main page
    When I sign in
    And I enter email and password
    And I'm successfully logged to My account page
    And I go to addresses button
    And I go to Create New Address
    Then I save address


