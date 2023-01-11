@regression
  Feature: Add different products to compare list
    Scenario: Logged user could add different products to compare list
      Given user go to login page
      Then user login with "esraa@gmail.com"and"123456"
      And user hover to random category "Electronics"
      And open sub category
      And add first item to compare list
      And user hover to random category "Apparel"
      And open sub category
      And add second item to compare list
      Then user will get successfully message
      And user's compare list will be updated