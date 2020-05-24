@Contiq
  Feature: Login steps for Contiq
    Scenario: Verify user can login
      Given: I open url "http://dev.contiq.com"
      Then I should see page title as "Contiq"
      When I type "retna+23@contiq.com" into element with xpath "//input[@placeholder='Email']"