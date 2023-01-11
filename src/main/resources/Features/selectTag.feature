@regression
  Feature:Logged user could select different tags
    Scenario: logged user could select a tag
      Given user go to login page
      Then user login with "esraa@gmail.com"and"123456"
      And user click on any category
      And user go to tags block and choose any tag
      Then user could get the tags result