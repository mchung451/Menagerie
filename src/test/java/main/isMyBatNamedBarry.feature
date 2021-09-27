Feature: Is the Bat named Barry?
  I want to know if the bat is named "Barry"

  Scenario: Name of bat is "Barry"
    Given It is named "Barry"
    When I ask what is your name
    Then I should be told "Yes"