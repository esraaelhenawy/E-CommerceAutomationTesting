@regression
Feature: Logged user could select different Categories
  Scenario: Logged User could Select random category then hover and open sub-Category
    Given user go to login page
    Then user login with "esraa@gmail.com"and"123456"
    And user hover to random category "Electronics"
    And open sub category
    Then user can get elements inside this category

  Scenario: Logged User could Select random category then hover without sub-category
    Given user go to login page
    Then user login with "esraa@gmail.com"and"123456"
    And user hover to random category "Digital downloads"
    And click On Category
    Then user can get elements inside this category
