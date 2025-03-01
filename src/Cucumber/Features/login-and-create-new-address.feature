Feature: Login to account and create new address

  Scenario: User can login to already created account and create new address
    Given I'm on a mystore main page
    When I sign in
    And I enter email and password
    Then I'm on Your account page
    And I click to addresses tile on page
    Then I click "Create new address"
    And I fill in the form "New address"
    Then  I click Save button
    And I close browser

