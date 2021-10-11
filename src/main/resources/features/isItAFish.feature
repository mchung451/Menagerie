Feature: Is an animal a fish
  As a zookeeper I want to check if the animal is a fish

Scenario: A salmon is a fish
  Given Salmon breathes water
  When Salmon is placed in water
  Then Salmon is a fish

Scenario: A dog is a fish
  Given Dog doesn't breathe water
  When Dog is placed in water
  Then Dog is not a fish

Scenario: A bat is a fish
  Given Bat doesn't breathe water
  When Bat is placed in water
  Then Bat is not a fish