
Feature: Login
  I want to login to testme

  @tag1
  Scenario Outline: login
    Given I want login
    When I enter username "<uname>" 
    And I enter my password "<pass>" 
    When user clicks login button
    Then I should be in homepage

    Examples: 
      | uname  | pass |
      | Lalitha |Password123 |
