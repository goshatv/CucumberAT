@i.ua @smoke
Feature: i.ua

  Scenario: Successful authorization
    Given ChromeDriver is started
    And Main page is opened
    When I click Enter button
    And I insert login
    And I insert password
    And I click Submit button
    Then Name of user is correct
    And Browser is closed

  Scenario: Authorization with invalid login
    Given ChromeDriver is started
    And Main page is opened
    When I click Enter button
    And I insert incorrect login
    And I insert password
    And I click Submit button
    Then Error message is displayed in new tab
    And Browser is closed

    Scenario: Sending of a new letter to myself
      Given Authorization is completed
      When I click on Write letter button
      And I insert recipient email
      And I insert topic
      And I insert letter body
      And I click send button
      And I open myself inbox
      And I open last new email
      Then Topic of email is correct
      And Sender email is correct
      And Body of email is correct


