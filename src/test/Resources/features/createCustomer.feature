@createcustomer

Feature: As an Enterprise user
  I can create the Customer user
  So that Customer add its own users

  Scenario Outline: Creating a customer
    Given I am on customer page
    When I create new customer
    And Enter "<customername>"
    And save the customer
    Then customer creates scuccessfully
    Examples:
      | customername   |
      | delete customer |