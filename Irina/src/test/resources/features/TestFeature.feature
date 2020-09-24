@Login
Feature: Login page
  Scenario: Check successful log in

    Given user is on Landing page
    When user enters email and passowrd
    And clicks on Login button
    Then "home" page is displayed