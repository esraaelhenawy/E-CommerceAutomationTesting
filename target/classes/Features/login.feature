@regression
Feature: user could login to the site
  Scenario: User could log in with valid email and password
    Given user go to login page
    And user login with "esraa@gmail.com"and"123456"
    Then user could login successfully and go to home page