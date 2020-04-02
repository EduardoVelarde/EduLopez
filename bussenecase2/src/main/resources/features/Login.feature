
@tag
Feature: log in page
  As user I shoul be able to log in
	So i can buy Products
  @Home
  Scenario: Validate credentials
    Given User is on Home page
    When User enters username as "test800@hotmail.com"
    And User enters password as "test123"
    And User click on sign in button 
    Then User should be logged correctly
 
  @Home
  Scenario: Title of your scenario
    Given User is on Home page
    When User enters username as "testder@hotmail.com"
    And User enters password as "467"
    And User click on sign in button 
    Then User should not be logged correctly
 
    
@Home
  Scenario: Title of your scenario
    Given User is on logged
  	When User click's an item
    And Click add to cart
    And click to proceed 
    And Proceed to checkout
    And Proceed to checkout2
    And Click Agreed with term of use
    And Proceed to checkout3
    And click Pay by Bank Wire
    And I confirm my order
    Then Your order on My Store is complete
    