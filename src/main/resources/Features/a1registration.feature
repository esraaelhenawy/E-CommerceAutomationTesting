@regression
Feature: user could register a new account
  Scenario:  User could register with valid data
    Given user go to registration page
    Then user choose gender
    And user enter first name "esraa"
    And user enter last name "Elhenawy"
    And user choose his birthDate "9" and "january" and "1996"
    And user enter "esraa@gmail.com"
    And user enter "123456" and confirm password
    And user click on register button
    Then user will register successfully
    And user will go to home page




