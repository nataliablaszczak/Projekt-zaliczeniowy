Feature: Login to account and create new address

  Scenario: User can login to already created account and create new address
    Given I'm on a mystore main page
    When I sign in
    And I enter email and password
    And I go to addresses button
    And I click Create New Address
#    And I fill in the form with <alias>, <address>, <city>, <postcode>, <country>, <phone>
#    And I check the correctness
#    Then I save address
#    Examples:
#      | alias | address          | city      | postcode | country | phone
#      | Home  | 1234 Test Street | Test City | 12345    | Poland  | 123456789 |



