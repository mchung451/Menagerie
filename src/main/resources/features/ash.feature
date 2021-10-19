Feature: Choosing cheapest item in wishlist
  A customer wants to add the cheapest item in their wishlist to the cart

  Scenario: Choosing 4 items
    Given I add four different products to my wish list
    When I view my wishlist table
    Then I find four selected items in my Wishlist
    When I search for the lowest price product
    And I am able to add the lowest price item to my cart
    Then I am able to verify the item in my cart