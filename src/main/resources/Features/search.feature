@regression
  Feature: Logged User could search for any product
    Scenario: user search for an exist item
      Given user go to login page
      Then user login with "esraa@gmail.com"and"123456"
      And user go to search button and entry "first"
      When user click on search button
      Then user get the element he search for

    Scenario: user search for a not exist item
      Given user go to login page
      Then user login with "esraa@gmail.com"and"123456"
      And user go to search button and entry "esraa"
      When user click on search button
      Then user get not found message