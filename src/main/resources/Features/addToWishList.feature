@regression
  Feature: Add different products to Wishlist
    Scenario: Logged user could add different products to Wishlist
      Given user go to login page
      Then user login with "esraa@gmail.com"and"123456"
      And user hover to random category "Electronics"
      And open sub category
      And user add first item to wish list
      Then user will get successfully message
      And user hover to random category "Apparel"
      And open sub category
      And user add second item to wish list
      Then user will get successfully message
      And user's wish list will be updated