@regression
  Feature: Make an order
    Scenario: user could make a successful order
      Given user go to login page
      Then user login with "esraa@gmail.com"and"123456"
      And user hover to random category "Electronics"
      And open sub category
      When user add first item to shopping cart
      And user hover to random category "Apparel"
      And open sub category
      When user add second item to shopping cart
      Then user's shopping cart will be updated
      And user could checkout
      And user continue entering his data
      And user choose shipping method
      And user choose payment method
      Then user get payment info
      And user could confirm his order
      And user's order could be completed

