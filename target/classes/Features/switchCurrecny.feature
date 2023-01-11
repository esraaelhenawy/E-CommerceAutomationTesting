@regression
Feature: Logged User could switch between currencies
  Scenario: Logged User could switch between currencies US-Euro
    Given user go to login page
    Then user login with "esraa@gmail.com"and"123456"
    And user go to currency dropdowns list and make it "U"
    Then currency changed