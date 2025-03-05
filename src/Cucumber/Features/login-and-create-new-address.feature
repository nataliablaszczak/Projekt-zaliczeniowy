Feature: Login to account and create new address

  Scenario Outline: User can login to already created account and create new address
    Given I'm on a mystore main page
    When I sign in
    And I enter email and password
    And I go to addresses button
    And I click Create New Address
    And I fill in the form with <alias>, <address>, <city>, <postcode>, <country>, <phone>
    Then I check that the last address has <alias>, <address>, <city>, <postcode>, <country>, <phone>

    Examples:
      | alias | address    | city      | postcode | country | phone       |
      | Home  | Test Street | Test City | 123-45   | United Kingdom | +48 1234567 |






