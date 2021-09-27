Feature: Is it a centipede?
  A zookeeper wants to know if an animal is a centipede


  Scenario: Centipede is a Centipede
    Given It has 100 legs
    When I ask how many legs it has
    Then I Should be told "Yes"
