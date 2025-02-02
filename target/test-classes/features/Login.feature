Feature: User login functionality

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters valid username and password
    Then User should be redirected to the home page

  Scenario: Unsuccessful login with invalid credentials
    Given User is on the login page
    When User enters invalid username and password
    Then User should see an error message
