@Reports
Feature: Sales orders

  As a dealer
  I want to check the sale reports of different regions
  So that I can manage the orders effectively.


  Scenario Outline: Customers' sales orders

    Given I am on the report page
    When I select the Sales Order
    And I select the <"Region">, <"State">, <"From Date"> and <"To Date">
    And generate an order report
    Then the order report generates successfully

    Examples:

      | Region         |  | State         |  | From Date  |  | To Date    |
      | AP Region      |  | Andhra Pradeh |  | 10-03-2016 |  | 12-03-2016 |
      | Eastern Region |  | Bihar         |  | 13-03-2016 |  | 14-03-2016 |


  Scenario: Dealers' sales orders

    Given: I am on the report page
    When I select the Dealers Sales Orders
    And I select the State,Dealer Code,From Date and To Date
    And generate an order
    Then the dealers order report generates successfully.






