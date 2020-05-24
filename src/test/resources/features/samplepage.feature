
@sample
  Feature: Predefined steps for Sample page
    @sample1
    Scenario: Verify Username requires min 2 chars
      Given I open url "http://skryabin.com/webdriver/html/sample.html"
      Then I should see page title as "Sample Page"
      When I type "r" into element with xpath "//input[@name='username']"
      And I click on element with xpath "//*[@name='email']"
    #  Then element with xpath "//*[@id='username-error']" should have text as "Please enter at least 2 characters."
      Then element with xpath "//*[@id='username-error']" should contain text " 2 characters."

     @sample2
     Scenario: Verify Password requires min 5 chars
       Given I open url "http://skryabin.com/webdriver/html/sample.html"
       Then I should see page title as "Sample Page"
       When I type "1234" into element with xpath "//*[@id='password']"
       And I click on element with xpath "//*[@name='phone']"
       Then element with xpath "//*[@id='password-error']" should contain text "5 characters."

      @sample3
      Scenario: Modal window pops-up
        Given I open url "http://skryabin.com/webdriver/html/sample.html"
        Then I should see page title as "Sample Page"
        When I click on element with xpath "//input[@id='name']"
        Then element with xpath "//div[@id='nameDialog']//div[1]" should be displayed

       @sample4
       Scenario: Verify submit works with required fields
         Given I open url "http://skryabin.com/webdriver/html/sample.html"
         Then I should see page title as "Sample Page"
         When I click on element with xpath "//input[@id='name']"
         Then element with xpath "//div[@id='nameDialog']//div[1]" should be displayed
         When I type "Retna" into element with xpath "//input[@id='firstName']"
         When I type "Ravi" into element with xpath "//input[@id='lastName']"
         And  I click on element with xpath "//span[contains(text(),'Save')]"
         Then element with xpath "//input[@id='name']" should have attribute "value" as "Retna Ravi"
         Then I type "retna2000" into element with xpath "//input[@name='username']"
         Then I type "retna2000@yahoo.com" into element with xpath "//input[@name='email']"
         Then I type "12345" into element with xpath "//input[@id='password']"
         Then I type "12345" into element with xpath "//input[@id='confirmPassword']"
         Then I click on element with xpath "//span[contains(text(),'I have read and accept Privacy Policy.')]"
         And I click on element with xpath "//button[@id='formSubmit']"
         Then element with xpath "//b[@name='username']" should have text as "retna2000"
         Then element with xpath "//b[@name='email']" should contain text "retna2000@yahoo.com"
        @sample4
        Scenario: Verify DOB dialog box
          Given I open url "http://skryabin.com/webdriver/html/sample.html"
          Then I should see page title as "Sample Page"
          Then I click on element with xpath //input[@id='dateOfBirth']
          Then element with xpath "//select[@class='ui-datepicker-month']" should be displayed
          Then element with xpath "//select[@class='ui-datepicker-year']" should be displayed
          Then
         @sample5
         Scenario: Verify CarMake Dropdown list
           Given I open url "http://skryabin.com/webdriver/html/sample.html"
           Then I should see page title as "Sample Page"
           Then element with xpath "//option[contains(text(),'Toyota')]" should have text as "Toyota"

          @sample6
          Scenario: IFrame
            Given I open url "http://skryabin.com/webdriver/html/sample.html"
            Then I should see page title as "Sample Page"
            When I switch to iframe with xpath "//iframe[@name='additionalInfo']"
            Then I type "Tom" into element with xpath "//input[@id='contactPersonName']"
            Then I type "12345678999" into element with xpath "//input[@id='contactPersonName']"
          #  And I switch to default content
            When I click on element with xpath "//input[@name='allowedToContact']"
            And I wait for 10 sec
            

         








      


