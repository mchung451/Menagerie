Feature: Confirming a centipede is a centipede
  A zookeeper wishes to confirm that a centipede is a centipede

  Scenario: Is a centipede a centipede?
  Given It has 100 legs
    When I ask how many legs it has
    Then I should be told Yes

  Scenario: Is a dog a centipede?
    Given It has 4 legs
    When I ask how many legs it has
    Then I should be told No

  Scenario: Is a salmon a centipede
    Given It has 0 legs
    When I ask how many legs it has
    Then I should be told No