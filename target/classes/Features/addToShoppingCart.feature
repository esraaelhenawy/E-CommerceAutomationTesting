@regression
  Feature: Add different products to Shopping cart
    Scenario:Logged user could add different products to Shopping cart
      Given user go to login page
      Then user login with "esraa@gmail.com"and"123456"
      And user hover to random category "Electronics"
      And open sub category
      When user add first item to shopping cart
      And user hover to random category "Apparel"
      And open sub category
      When user add second item to shopping cart
      Then user's shopping cart will be updated




