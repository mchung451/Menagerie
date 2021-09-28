Feature: Is an animal a fish
  As a zookeeper I want to check if the animal is a fish

Scenario: A Salmon is a fish
  Given Salmon breathes water
  When Salmon is placed in water
  Then Salmon is a fish