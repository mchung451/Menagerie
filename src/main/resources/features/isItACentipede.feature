Feature: Is an animal a centipede
  As a zookeeper I want to check if the animal is a centipede

  Scenario: A centipede is a centipede
    Given It has 100 legs
    When I ask how many legs it has
    Then I should be told Yes

  Scenario: A dog is a centipede
    Given It has 4 legs
    When I ask how many legs it has
    Then I should be told a dog is not a centipede

  Scenario: A salmon is a centipede
    Given It has 0 legs
    When I ask how many legs it has
    Then I should be told a salmon is not a centipede