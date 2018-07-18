@Login
Feature: i.ua

  Scenario: Login
    Given ChromeDriver is started
    And Main page is opened
    When I click Enter button
    And I insert login
    And I insert password
    And I click Submit button
    Then Name of user is correct
    And Browser is closed

    Scenario: Invalid login
      Given ChromeDriver is started
      And Main page is opened
      When I click Enter button
      And I insert incorrect login
      And I insert password
      And I click Submit button
      Then Error message is displayed in new tab
      And Browser is closed