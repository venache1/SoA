Feature: test login page
  Scenario: login with valid email
    Given User is on landing page
    When user cliks on login button
    Then "home page" is diplayed