@webdriver
  Feature: WebDriver
    @webdriver1
    Scenario: Open the page
      Given I go to "google" and print details
      And I go to " sample" and print details
      And I go back and forward, then refresh
    @webdriver2
    Scenario: Submit Sample page
      Given I go to "sample"
      When I fill out first name "Peter" and last name "Orange"
      And I fill out all required fields



