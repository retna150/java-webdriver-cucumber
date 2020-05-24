@predefined
Feature: Smoke steps

  @predefined1
  Scenario: Predefined steps for Google
    Given I open url "https://google.com"
    Then I should see page title as "Google"
    Then element with xpath "//input[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@name='q']"
    Then I click on element using JavaScript with xpath "(//input[@name='btnK'])[1]"
    Then I wait for element with xpath "//*[@id='res']" to be present
    Then element with xpath "//*[@id='res']" should contain text "Cucumber"

  @predefined2
  Scenario: Steps for Yahoo
    Given I open url "https://www.yahoo.com/"
    Then  I should see page title as "Yahoo"
    And element with xpath "//input[@id='header-search-input']" should be present
    When I type "Java" into element with xpath "//input[@id='header-search-input']"
    And I click on element with xpath "//*[@type='submit']"
    And I wait for 10 sec
    Then I wait for element with xpath "//div[@id='bd']" to be present
    Then element with xpath "//div[@id='bd']" should not have text as "<string>"
  
    