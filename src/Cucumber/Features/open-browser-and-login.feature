Feature: Open Browser and User Login

  Scenario: Open browser and log in with valid credentials
    Given the user opens the browser
    And the user is on the login page
    When the user logs in with the email and password
    Then the user should be redirected to the dashboard
    And the user should see the name on the dashboard



