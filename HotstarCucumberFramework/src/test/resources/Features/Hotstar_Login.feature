Feature: Feature to test login functionality

  Scenario Outline: Login with valid credentials
    Given Browser is open
    And Land on login page
    When User enters valid credentials <mobile number>
    And Click on CONTINUE button
    Then Enters OTP
    And Again click on CONTINUE button
    Then User land on HOMEPAGE.

    Examples: 
      | name          |  | value      |
      | mobile number |  | 9958522262 |
