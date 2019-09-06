
Feature: Registration
  I want to use this template for my registration

  @sanity
  Scenario Outline: Registration
    Given I want to Register in testme
    When user enters un "<username>" 
    And user enters fn "<firstname>" 
    And user enters ln "<lastname>" 
    And user enters p "<pass>" 
    And user enters cp "<cpass>" 
    And user enters g "<gender>" 
    And user enters e "<email>" 
    And user enters pn "<pno>" 
    And user enters d "<dob>" 
    And user enters a "<address>" 
    And user enters s "<sec>" 
    And user enters an "<ans>" 
    When user clicks register button
    Then I user gets successfull registration

Examples:
			| username   |firstname | lastname  | pass   | cpass  | gender  |  email            | pno      | dob      | address  | sec | ans  |
      |SelArunnnKumar| Arun     | Kumar     |12345678|12345678|m|arunkumar@gmail.com|1234567890|02/07/2000|sdtgfsfdhr|1    |blue  |

     
