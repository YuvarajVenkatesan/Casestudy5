
Feature: to search a product
  I want to search a product after logged in

  @tag2
  Scenario Outline: Search a product
    Given I want to login and search a product
    When I login "<username>" and "<password>" 
    And  search a product by typing "<search>" 
    And click find details button
		Then products searched should be displayed

    Examples: 
      | username  | password | search  |
      | Lalitha |  Password123 | Headphone |
