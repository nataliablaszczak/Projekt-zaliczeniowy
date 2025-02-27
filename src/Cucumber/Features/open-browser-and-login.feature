Feature: Open Browser and User Login

  Scenario: Open browser and log in with valid credentials
    Given the user opens the browser google.com
    And the user is on the login page
    When the user logs in with the email "rrfeistppnujilwycig@nbmbb.com" and password "Hasło1234#@!"
    Then the user should be redirected to the dashboard
    And the user should see the name "Natalia Blk" on the dashboard



