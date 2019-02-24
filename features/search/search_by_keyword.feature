@TestSearch
Feature: Searching Products
  
  In order to find items that I would like to purchase
  As a potential buyer
  I want to be able to search for items

  @singleSearch
  Scenario: Searching the product using search functionality
    Given I am on the application
    When I search for items containing "printed"
    Then I should only see items related to "printed"

  @categorySearch
  Scenario Outline: Searching product using category and sub category
    Given I am on the application
    When I have searched for <category> category
    And I filter results by <Subcategories>
    Then I should see only <Subcategories>
    And Title of the page should be <Subcategories>

    Examples: 
      | category | Subcategories   |
      | Dresses  | Summer Dresses  |
      | Dresses  | Evening Dresses |
      | Dresses  | Casual Dresses  |
