Feature: Does a dog needs a vaccine
  As a zookeeper, I want to know if a dog needs a vaccine dependant on birth year

  Scenario: A dog named Barney is not vaccinated
    Given Barney has not been vaccinated
    When I check the Barney's birth year
    Then I should write a note on Barney saying "list the dog to be vaccinated"

  Scenario: A dog named Baxter is not vaccinated
    Given Baxter has been vaccinated
    When I check the Baxter's birth year
    Then I should write a note on Baxter saying "not list the dog to be vaccinated"


