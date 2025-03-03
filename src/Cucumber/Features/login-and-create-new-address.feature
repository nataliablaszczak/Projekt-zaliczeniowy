Feature: Login to account and create new address

  Scenario: User can login to already created account and create new address
    Given I'm on a mystore main page
    When I sign in
    And I enter email and password
    And I go to addresses button
    And I click Create New Address
    And I fill in the New Addres form
    And I check the correctness
    Then I save address



