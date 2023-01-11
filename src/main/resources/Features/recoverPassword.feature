@regression
  Feature: User could reset his/her password successfully
    Scenario: user could recover his password with sent email
      Given user go to login page
      Then user click on forget password
      And user enter his email "es@gmail.com"
      And user click on recover button
      Then user get recovery message
