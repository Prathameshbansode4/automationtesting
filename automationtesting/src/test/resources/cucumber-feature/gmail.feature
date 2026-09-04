Feature: Gmail Login

  Scenario: Gmail login test

    Given user is on Gmail login page
    When user enters username
    Then Gmail home page should be displayed