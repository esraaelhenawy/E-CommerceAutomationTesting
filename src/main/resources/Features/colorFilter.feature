@regression
  Feature:Logged user could filter with color
    Scenario: user could filter shoes category with one color
      Given user go to login page
      Then user login with "esraa@gmail.com"and"123456"
      And user hover to random category "Apparel"
      And open sub category
      When user go to Filter by attributes to choose color
      And user click on color check box for color "Red"
      Then user get filter result

      Scenario: user could filter shoes category with two colors
        Given user go to login page
        Then user login with "esraa@gmail.com"and"123456"
        And user hover to random category "Apparel"
        And open sub category
        When user go to Filter by attributes to choose color
        And user click on color check box for color "Red"
        And user click on color check box for color "Blue"
        Then user get filter result for all colors
