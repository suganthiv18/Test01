Feature: feature to check login page
@smoketest
  Scenario: Check login is successful
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then use is navigated to the homepage
