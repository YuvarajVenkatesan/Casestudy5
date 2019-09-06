
Feature: invalid cart options


  @tag3
  Scenario: user tries to proceed to payment without adding any item to the cart
    Given Alex has registered in to testme app
    When Alex search a particular product like headphones
    And try to proceed to payment without adding any item in the cart
    Then Testme app doesnt display the cart icon